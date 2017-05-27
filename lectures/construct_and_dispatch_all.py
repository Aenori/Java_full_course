import os, shutil
import subprocess


for dirpath, dirnames, filenames in os.walk("src"):
    for it_file in filter( lambda x : x.endswith(".txt"), filenames ):

        call_parameters = ["/bin/bash", "/home/nicolas/dev/tools/usr_bin/make_a4_htmlpdf.sh", dirpath + "/" + it_file ]
        pdf_path, pdf_file_name   = "pdf/"  + dirpath[4:], it_file[:-4] + ".pdf"
        html_path, html_file_name = "html/" + dirpath[4:], it_file[:-4] + ".html"
        print( call_parameters )
        subprocess.check_call( call_parameters )
        
        shutil.move( "pdf/"  + pdf_file_name, pdf_path  + "/" + pdf_file_name )
        shutil.move( "pdf/" + html_file_name, html_path + "/" + html_file_name )



