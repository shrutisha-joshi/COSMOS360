package com.robovitics.cosmos360.cosmos_360;


import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {


    ImageView QRimage;
    String QRtext = "16BCE2304";
    public final static int QRcodeWidth = 500 ;
    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        android.support.v7.widget.Toolbar toolbar = view.findViewById(R.id.toolbarprofile);
        toolbar.setTitle(getResources().getString(R.string.nav_home));
        QRimage = view.findViewById(R.id.QRimage);
        try {
            Bitmap bitmap = TextToImageEncode(QRtext);

            QRimage.setImageBitmap(bitmap);

        } catch (WriterException e) {
            e.printStackTrace();
        }
        return view;
    }

    private Bitmap TextToImageEncode(String Value) throws WriterException {
        MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
        BitMatrix bitMatrix = multiFormatWriter.encode(Value, BarcodeFormat.QR_CODE,500,500);
        BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
        Bitmap bitmpap = barcodeEncoder.createBitmap(bitMatrix);
        return bitmpap;
    }

}
