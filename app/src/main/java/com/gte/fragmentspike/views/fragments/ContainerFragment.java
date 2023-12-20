package com.gte.fragmentspike.views.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gte.fragmentspike.R;
import com.gte.fragmentspike.databinding.FragmentContainerBinding;

public class ContainerFragment extends Fragment {

    private FragmentContainerBinding binding;
    public ContainerFragment() {
    }

    public static ContainerFragment newInstance() {
        ContainerFragment fragment = new ContainerFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_container, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding = FragmentContainerBinding.bind(view);
        startNavigate();
    }

    private void startNavigate() {
        binding.btnNext.setOnClickListener(v -> {
            NavDirections action = ContainerFragmentDirections.actionContainerFragmentToSecondFragment();
            Navigation.findNavController(v).navigate(action);
        });
    }
}