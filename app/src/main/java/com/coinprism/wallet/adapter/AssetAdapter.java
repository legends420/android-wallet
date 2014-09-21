package com.coinprism.wallet.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.coinprism.model.AssetBalance;
import com.coinprism.wallet.R;

import java.util.List;

public class AssetAdapter extends ArrayAdapter<AssetBalance>
{
    private final Context context;
    private final List<AssetBalance> values;

    public AssetAdapter(Context context, List<AssetBalance> values)
    {
        super(context, R.layout.asset_balance_item, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.asset_balance_item, parent, false);
        ((TextView) rowView.findViewById(R.id.assetName))
            .setText(values.get(position).getAsset().getName());

        ((TextView) rowView.findViewById(R.id.issuerName))
            .setText(values.get(position).getAsset().getName());

        return rowView;
    }
}
