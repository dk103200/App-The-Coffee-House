package com.example.thecoffeehouse.tablayout;

import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.thecoffeehouse.R;
import com.example.thecoffeehouse.model_adapter.DoUong;
import com.example.thecoffeehouse.model_adapter.SanPhamAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class PhoBienFragment extends Fragment {

    private GridView gvmon_241;
    private SanPhamAdapter spadt_241;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View r = inflater.inflate(R.layout.fragment_pho_bien, container, false);
        gvmon_241 = r.findViewById(R.id.gv_mon);
        spadt_241 = new SanPhamAdapter(PhoBienFragment.this.getActivity(), R.layout.item);
        gvmon_241.setAdapter(spadt_241);
        registerForContextMenu(gvmon_241);
        setGridView();
        addEvents();

        return r;
    }

    private void setGridView() {
        spadt_241.add(new DoUong(R.drawable.choco_nong, "Socola Lúa Mạch nóng", "69.000"));
        spadt_241.add(new DoUong(R.drawable.choco_xay, "Socola Lúa Mạch đa xay", "69.000"));
        spadt_241.add(new DoUong(R.drawable.cafe_lm_nong, "Cà phê Lúa Mạch nóng", "69.000"));
        spadt_241.add(new DoUong(R.drawable.cafe_lm_lanh, "Lúa Mạch nóng đá", "69.000"));
        spadt_241.add(new DoUong(R.drawable.ts_maca, "Trà Sữa Mắc Ca Trân Châu Trắng", "45.000"));
        spadt_241.add(new DoUong(R.drawable.macca, "Macca Phủ Socola", "45.000"));
        spadt_241.add(new DoUong(R.drawable.tradao, "Trà Đào Cam Sả -Đá", "45.000"));

    }

    private void addEvents() {
        gvmon_241.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Dialog dialog = new Dialog(PhoBienFragment.this.getActivity());
                dialog.setContentView(R.layout.dialog_dathang);
                dialog.show();
            }
        });

    }
}