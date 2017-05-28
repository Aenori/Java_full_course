import os, shutil
import subprocess

default_path = os.getcwd()

for dirpath, dirnames, filenames in os.walk("src"):
    for it_file in filter( lambda x : x.endswith(".txt"), filenames ):
        src_full_path = dirpath + "/" + it_file
        call_parameters = ["/bin/bash", "/home/nicolas/dev/tools/usr_bin/make_a4_htmlpdf.sh", src_full_path ]
        pdf_path, pdf_file_name   = default_path + "/pdf/"  + dirpath[4:], it_file[:-4] + ".pdf"
        html_path, html_file_name = default_path + "/html/" + dirpath[4:], it_file[:-4] + ".html"
        pdf_full_path  = pdf_path  + "/" + pdf_file_name
        html_full_path = html_path + "/" + html_file_name
        
        if ( os.path.isfile(pdf_full_path) and os.path.isfile(html_full_path) and
            (os.path.getmtime(src_full_path) < os.path.getmtime(pdf_full_path)) and 
            (os.path.getmtime(src_full_path) < os.path.getmtime(html_full_path)) and 
            (len( subprocess.check_output(["/usr/bin/git", "diff", src_full_path]) ) == 0)):
            print( "File {0} older than its html and pdf, and not modified by git, skipping it ...".format(
                src_full_path) )
            continue
       

        print( call_parameters )
        subprocess.check_call( call_parameters )
        
        shutil.move( "pdf/" + html_file_name, html_full_path )
        shutil.move( "pdf/"  + pdf_file_name, pdf_full_path )
        
        if (    (len( subprocess.check_output(["/usr/bin/git", "diff", html_full_path]) ) == 0) 
            and (len( subprocess.check_output(["/usr/bin/git", "diff", pdf_full_path ]) ) != 0)) :
            subprocess.check_call(["/usr/bin/git", "checkout", "--", pdf_full_path])

