package com.delta.magiclistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by spawrks on 8/15/13.
 */
public class PlaceAdapter extends ArrayAdapter<Place> {

    Context mContext;
    int mLayoutResourceId;
    Place mData[] = null;

    public PlaceAdapter(Context context, int layoutResourceId, Place[] data){
        super(context,layoutResourceId,data);
        this.mContext = context;
        this.mLayoutResourceId = layoutResourceId;
        this.mData = data;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View row = convertView;
        PlaceHolder holder = null;

        if(row == null)
        {
            //Create a new View
            LayoutInflater inflater = LayoutInflater.from(mContext);
            row = inflater.inflate(mLayoutResourceId, parent, false);

            holder = new PlaceHolder();

            holder.nameView = (TextView) row.findViewById(R.id.name);
            holder.zipView = (TextView) row.findViewById(R.id.zipcode);

            row.setTag(holder);
        }else{

            //Use an existing one
            holder = (PlaceHolder)row.getTag();
        }
        //Getting the data from the data array
        Place place = mData[position];
        //setting the view to reflect the data we need to display
        holder.nameView.setText(place.mNameOfPlace);
        holder.zipView.setText(Integer.toString(place.mZipCode));

        //returning the row ( because this is called getView after all)
        return row;
    }

    static class PlaceHolder{
        TextView nameView;
        TextView zipView;

    }
}
