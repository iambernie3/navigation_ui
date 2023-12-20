package com.gte.fragmentspike.views.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.gte.fragmentspike.R;
import com.gte.fragmentspike.databinding.SettingFragmentBinding;

public class SettingFragment extends Fragment {
    private SettingFragmentBinding binding;
//    SettingFragment() {
//        super(R.layout.setting_fragment);
//    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.setting_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding = SettingFragmentBinding.bind(view);
    }
}
