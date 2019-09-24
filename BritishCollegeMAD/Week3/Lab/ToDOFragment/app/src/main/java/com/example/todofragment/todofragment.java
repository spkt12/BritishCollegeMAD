package com.example.todofragment;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

import com.example.todofragment.model.TodoDS;

import java.util.UUID;



    /**
     * A simple {@link Fragment} subclass.
     */
    public Static class TodoFragment extends Fragment {

        private Todo mTodo;
        private EditText mEditTextTitle;
        private Button mButtonDate;
        private CheckBox mCheckBoxIsComplete;

        private static final String ARG_TODO_ID = "todo_id";


        public TodoFragment() {
            // Required empty public constructor
        }

        /*
        Rather than the calling the constructor directly, Activity(s) should call newInstance
        and pass required parameters that the fragment needs to create its arguments.
         */
        public static TodoFragment newInstance(UUID todoId) {
            Bundle args = new Bundle();
            args.putSerializable(ARG_TODO_ID, todoId);

            TodoFragment fragment = new TodoFragment();
            fragment.setArguments(args);
            return fragment;
        }


        @Override
        public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            UUID todoId = (UUID) getArguments().getSerializable(ARG_TODO_ID);

            mTodo = TodoDS.getInstance(getActivity()).getTodo(todoId);
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            View view  =  inflater.inflate(R.layout.fragment_todo, container, false);
            mEditTextTitle = (EditText) view.findViewById(R.id.todo_title);
            mEditTextTitle.setText(mTodo.getTitle());
            mEditTextTitle.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                    // This line is intentionally left blank
                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    mTodo.setTitle(s.toString());
                }

                @Override
                public void afterTextChanged(Editable s) {
                    // This line is intentionally left blank
                }
            });

            mButtonDate = (Button) view.findViewById(R.id.todo_date);
            mButtonDate.setText(mTodo.getDate().toString());
            mButtonDate.setEnabled(false);
            mCheckBoxIsComplete = (CheckBox) view.findViewById(R.id.todo_complete);
            mCheckBoxIsComplete.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    Log.d("DEBUG **** TodoFragment","called onCheckedChanged");
                    mTodo.setComplete(isChecked==true ? 1 : 0);
                }
            });


            return view;
        }

    }