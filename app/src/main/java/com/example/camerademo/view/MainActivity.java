package com.example.camerademo.view;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.camerademo.R;

import static com.example.camerademo.util.Constant.camera;
import static com.example.camerademo.util.Constant.selectedImagePatch;

public class MainActivity extends BaseActivity implements View.OnClickListener {
    private ImageView selectedImg;
    private ImageButton camBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        selectedImg = findViewById(R.id.selectedImg);
        camBtn = findViewById(R.id.camBtn);
        camBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.camBtn:
                selectedImagePatch = camera;
                cameraAlert();
                break;
        }
    }

    @Override
    public void imageSelect(Uri imagePath) {
        super.imageSelect(imagePath);
        if (imagePath != null) {
            selectedImg.setImageURI(imagePath);
        }
    }

}
