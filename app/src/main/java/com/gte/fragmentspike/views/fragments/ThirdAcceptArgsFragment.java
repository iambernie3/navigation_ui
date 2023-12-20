package com.gte.fragmentspike.views.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.gte.fragmentspike.R;
import com.gte.fragmentspike.databinding.ThirdAcceptArgsFragmentBinding;

public class ThirdAcceptArgsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.third_accept_args_fragment,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ThirdAcceptArgsFragmentBinding binding = ThirdAcceptArgsFragmentBinding.bind(view);
        ThirdAcceptArgsFragmentArgs args = ThirdAcceptArgsFragmentArgs.fromBundle(getArguments());
        binding.tvAddress.setText(args.getAddress());
        binding.tvName.setText(args.getUserName());
    }
}
