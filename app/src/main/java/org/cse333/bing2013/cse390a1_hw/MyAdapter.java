package org.cse333.bing2013.cse390a1_hw;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by bing2013 on 10/30/16.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    private String[] mDataset;

    // Provde a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder{
        // each data item is just a string in this case
        public TextView mTextView;
        public ViewHolder(TextView v){
            super(v);
            mTextView = v;
        }

    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(String[] myDataset){
        myDataset = myDataset;
    }

    // Create new views (invoked by the lay
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        // create a new view
        // TextView v = LayoutInflater.from(parent.getContext()).inflate(R.id.my_text_view, parent, false);

        // set the view's size, margins, paddings and layout parameters

        // ViewHolder vh = new ViewHolder(v);

        // return vh;

        return null;

    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {

        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.mTextView.setText(mDataset[position]);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
