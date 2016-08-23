package iterative.com.br.testefino;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

public class FinoFragment extends Fragment {

    private static final String ARG_BG = "bg";

    private int mBg;

    public FinoFragment() {
        // Required empty public constructor
    }

    public static FinoFragment newInstance(int mBg) {
        FinoFragment fragment = new FinoFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_BG, mBg);
        fragment.setArguments(args);
        return fragment;
    }

    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mBg = getArguments().getInt(ARG_BG);
        }
    }

    @Override public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_fino, container, false);

        ImageView viewBg = (ImageView) v.findViewById(R.id.image);

        Picasso.with(getActivity())
            .load(mBg)
            .transform(new BitmapTransform(1920, 1080))
            .fit()
            .into(viewBg);

        // Inflate the layout for this fragment
        return v;
    }
}
