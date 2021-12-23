package org.lxh.demo;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class  DistanceConverter extends Activity {
  //Initialization
   private EditText editmile = null;
   private Button milebtn = null;
   private TextView showViewKm = null;
   private float milenum = 0;
   private EditText editkm = null;
   private Button kmbtn = null;
   private TextView showViewMile = null;
   private float kmnum = 0;
   @Override
   public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      super.setContentView(R.layout.main);

      this.kmbtn = (Button) super.findViewById(R.id.outputkm); 
      this.editmile = (EditText) super.findViewById(R.id.mileinputfield); 
      this.showViewKm = (TextView) super.findViewById(R.id.resultkm); 
    
      this.milebtn = (Button) super.findViewById(R.id.outputmiles); 
      this.editkm = (EditText) super.findViewById(R.id.kminputfield); 
      this.showViewMile = (TextView) super.findViewById(R.id.resultmile); 
     
      this.milebtn.setOnClickListener(new MileListener());
      this.kmbtn.setOnClickListener(new KmListener());
     
      this.edit.setOnClickListener(new OnClickListener() {
         public void onClick(View v) 
         { DistanceConverter.this.editmile.setText("");}
      });
     
      this.edit1.setOnClickListener(new OnClickListener() {
         public void onClick(View v) {
            DistanceConverter.this.editkm.setText("");
         }
      });
   }
    
   private class KmListener implements OnClickListener {
      //Converting into km  
      public void onClick(View v) 
      {  DistanceConverter.this.milenum = Integer.parseInt(MyClickDemo.this.edit.getText().toString()); 
         DistanceConverter.this.showViewKm.setText(String.format("The corresponding kilometer value is: %.2f", milenum * 1.6));
      } 
   }

   private class MileListener implements OnClickListener {
      //Converting into miles
      public void onClick(View v) 
      {  DistanceConverter.this.kmnum = Integer.parseInt(MyClickDemo.this.edit1.getText().toString());
         DistanceConverter.this.showViewMile.setText(String.format("The corresponding mile value is: %.2f", kmnum * 0.625));
      } 
   }
  
   }
