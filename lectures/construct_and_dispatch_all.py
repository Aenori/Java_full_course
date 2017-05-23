import os
import subprocess
for dirpath, dirnames, filenames in os.walk("src"):
    for it_file in filter( lambda x : x.endswith(".txt"), filenames ):
        subprocess.check_call( ["/home/nicolas/dev/tools/usr_bin/make_a4_htmlpdf.sh", it_file ] )



