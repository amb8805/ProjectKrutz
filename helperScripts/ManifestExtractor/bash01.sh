#!/bin/bash

# Written by: Cesar Armando Perez Fernandez

# SCRIPT SETTINGS
apk_copies_folder="apk_copies"
android_manifest_dest="android_manifests"

# *** SCRIPT START ***

# ====================
# Creates a directory.
# ====================
create_directory(){  
    if [ -d $1 ]; 
    then
        rm -rf $1 # if exists, delete it
    fi

    mkdir $1 # create the directory
}

# ==========================================
# changes the extension of the .apk to .zip.
# ==========================================
change_extension(){
    apk_files=($apk_copies_folder/*.apk)
    
    for apk_file in "${apk_files[@]}"; 
    do
         mv "$apk_file" "${apk_file%.apk}.zip"
    done
}

# ==============================================
# Copies all apks into the apk copies directory.
# ==============================================
copy_apk_files(){
    android_apks="$(find . -name '*.apk')"

    for apk_file in "${android_apks[@]}"; 
    do
        cp -uf $apk_file $apk_copies_folder
    done
}

# ===================================
# Extracts all the android manifests.
# ===================================
extract_android_manifest(){
    total_num_files=0
    
    android_zipped_apks_str="$(find $apk_copies_folder -name '*.zip')"
   
    create_directory $android_manifest_dest
    
    IFS=' ' read -ra android_zipped_apks <<< ${android_zipped_apks_str}
    
    for android_zipped_apk in "${android_zipped_apks[@]}"; 
    do  
        ((total_num_files+=1))
        
        new_directory_name=${android_zipped_apk:11:${#android_zipped_apk}-15}
        
        create_directory $android_manifest_dest/$new_directory_name
        
        unzip "$android_zipped_apk" "AndroidManifest.xml" -d "$android_manifest_dest/$new_directory_name" 
    done
    
    echo " *** -- Total number of files obtained: $total_num_files -- *** "
}

# ===================
# Deletes the copies.
# ===================
clean_up(){
    rm -r $apk_copies_folder
}

# SCRIPT ORDER OF EXECUTION
create_directory $apk_copies_folder
copy_apk_files
change_extension
extract_android_manifest
clean_up

# *** SCRIPT END ***