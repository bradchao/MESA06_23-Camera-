package com.example.user.brad23;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.hardware.Camera;

/**
 * Created by user on 2016/11/29.
 */

public class MyPreview extends SurfaceView implements SurfaceHolder.Callback {
    private Camera camera;

    public MyPreview(Context context, android.hardware.Camera camera) {
        super(context);
        this.camera = camera;
    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {

    }
}
