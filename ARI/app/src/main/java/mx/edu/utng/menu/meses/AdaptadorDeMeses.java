package mx.edu.utng.menu.meses;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import mx.edu.utng.menu.R;

/**
 * {@link BaseAdapter} para poblar coches en un grid view
 */

public class AdaptadorDeMeses extends BaseAdapter {
    private Context context;

    public AdaptadorDeMeses(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return Meses.ITEMS.length;
    }

    @Override
    public Meses getItem(int position) {
        return Meses.ITEMS[position];
    }

    @Override
    public long getItemId(int position) {
        return getItem(position).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.grid_item, viewGroup, false);
        }

        ImageView imagenCoche = (ImageView) view.findViewById(R.id.imagen_meses);
        TextView nombreCoche = (TextView) view.findViewById(R.id.nombre_meses);

        final Meses item = getItem(position);
        Glide.with(imagenCoche.getContext())
                .load(item.getIdDrawable())
                .into(imagenCoche);

        nombreCoche.setText(item.getNombre());

        return view;
    }

}