package com.example.camerademo.util;

import android.net.Uri;

public class Constant {
    public static Uri uriiii;
    public static String selectedImagePatch ="";
    public static final String IMAGE_DIRECTORY_NAME_TEMP= "CameraModule/temp";
    public static String camera = "/camera/";
    public static String gallery = "/gallery/";
    public static String BaseFolder = "CameraModule/images/";


    // Activity request codes
    public static final int CAMERA_CAPTURE_IMAGE_REQUEST_CODE = 100;
    public static final int GET_IMAGE_GALLERY = 200;
    public static int IMAGE_REQUEST_CODE_ASK_PERMISSIONS = 201;
    public static int IMAGE_REQUEST_CODE_ASK_PERMISSIONS_STORAGE = 202;

}
