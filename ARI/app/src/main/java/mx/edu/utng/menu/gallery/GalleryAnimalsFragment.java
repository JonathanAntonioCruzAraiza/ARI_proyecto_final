package mx.edu.utng.menu.gallery;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import mx.edu.utng.menu.R;

/**
 * Created by jony on 02/03/17.
 */



public class GalleryAnimalsFragment extends Fragment {
    private int currentIndex;
    private ArrayList<ImageItem> imageItems;
    private int[] photos={
            R.drawable.aguila,
            R.drawable.arana,
            R.drawable.ardilla,
            R.drawable.becerro,
            R.drawable.burro,
            R.drawable.caballo,
            R.drawable.cebra,
            R.drawable.camello,
            R.drawable.cerdo,
            R.drawable.conejo,
            R.drawable.cotorro,
            R.drawable.cuervo,
            R.drawable.elefante,
            R.drawable.gallina,
            R.drawable.gallo,
            R.drawable.gato,
            R.drawable.leon,
            R.drawable.lobo,
            R.drawable.oso,
            R.drawable.paloma,
            R.drawable.pato,
            R.drawable.perico,
            R.drawable.perro,
            R.drawable.pez,
            R.drawable.pichon,
            R.drawable.serpiente,
            R.drawable.tigre,
            R.drawable.tortuga,
            R.drawable.zorro,


    };
    private ViewPager vpGallery;
    private Context context;
    private GalleryManager galleryManager;
    public GalleryAnimalsFragment() {
        this.currentIndex = 0 ;
        this.imageItems = new ArrayList();
    }//fin del metodoto GalleryLettersFragment

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_fragment_animals,container,false) ;
    }//fin metodo onCreateView

    @Override
    public void onStart() {
        super.onStart();
        context = getActivity();
        FragmentManager fragmentManager = getFragmentManager();
        galleryManager = new GalleryManager(fragmentManager);
        vpGallery=(ViewPager)getView().findViewById(R.id.vp_gallery_animals);
        for (int i = 0; i < photos.length; i++) {
            galleryManager.addFragment(FragmentImage.newInstance(photos[i]));
        }
        vpGallery.setAdapter(galleryManager);
        getActivity().onWindowFocusChanged(true);

    }//fin metodo onStart

    public class GalleryManager extends FragmentPagerAdapter {
    List<Fragment> fragments;

        public GalleryManager(FragmentManager fm) {
            super(fm);
            fragments = new ArrayList();
        }

        public void addFragment(Fragment fragment){
            fragments.add(fragment);
        }
        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }//fin getItem

        @Override
        public int getCount() {
            return fragments.size();
        }//fin getCount
    }

    public static class FragmentImage extends Fragment {
        private static final String KEY_IMAGE="image";
        private int image;
        public static FragmentImage newInstance(int image){
            FragmentImage fragmentImage = new FragmentImage();
            Bundle bundle = new Bundle();
            bundle.putInt(KEY_IMAGE,image);
            fragmentImage.setArguments(bundle);
            fragmentImage.setRetainInstance(true);
            return fragmentImage;
        }//fin FragmentImage

        @Override
        public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            if (getArguments()!=null){
                image=getArguments().getInt(KEY_IMAGE);
            }
        }//fin on create

        public FragmentImage(){}

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater,
                                 @Nullable ViewGroup container,
                                 @Nullable Bundle savedInstanceState) {
           View rootView = inflater.inflate(R.layout.gallery_layout_animals,container,false);
            ImageView ivPhoto = (ImageView) rootView.findViewById(R.id.iv_photo_animals);
            ivPhoto.setImageResource(image);
            return rootView;
        }//fin metodo onCreateView
    }

}//fin de la clase
