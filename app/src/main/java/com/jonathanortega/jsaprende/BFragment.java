package com.jonathanortega.jsaprende;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class BFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_b, container, false);

        TextView question = view.findViewById(R.id.textQuestion);
        TextView score = view.findViewById(R.id.textScore);

        Button answer1 = view.findViewById(R.id.answer1);
        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Pregunta 1");
            }
        });

        Button answer2 = view.findViewById(R.id.answer2);
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Pregunta 2");
            }
        });

        Button answer3 = view.findViewById(R.id.answer3);
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Pregunta 3");
            }
        });

        Button answer4 = view.findViewById(R.id.answer4);
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Pregunta 4");
            }
        });

        Button nextQuestion = view.findViewById(R.id.button_next);
        nextQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                NavHostFragment.findNavController(AFragment.this)
//                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
                System.out.println("Siguiente pregunta");
            }
        });

        return view;
    }
}
