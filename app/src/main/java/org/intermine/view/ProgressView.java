package org.intermine.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import org.intermine.R;

public class ProgressView extends RelativeLayout {
    private ImageView mProgress;
    private Animation mAnimation;

    public ProgressView(Context context) {
        super(context, null);
    }

    public ProgressView(Context context, AttributeSet attrs, boolean a) {
        super(context, attrs);

        String service = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(service);

        inflater.inflate(R.layout.progress_view, this, true);

        if (!isInEditMode()) {
            mAnimation = AnimationUtils.loadAnimation(context, R.anim.rotate_infinite);

            mProgress = (ImageView) findViewById(R.id.progress_view_progress);
            mProgress.startAnimation(mAnimation);
        }
    }

    public ProgressView(Context context, AttributeSet attrs) {
        super(context, attrs);

        String service = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(service);

        inflater.inflate(R.layout.progress_view, this, true);

        if (!isInEditMode()) {
            mAnimation = AnimationUtils.loadAnimation(context, R.anim.rotate_infinite);

            mProgress = (ImageView) findViewById(R.id.progress_view_progress);
            mProgress.startAnimation(mAnimation);
        }
    }
}
