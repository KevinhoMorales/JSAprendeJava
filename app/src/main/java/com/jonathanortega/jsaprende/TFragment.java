package com.jonathanortega.jsaprende;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class TFragment extends Fragment {

    private Boolean correct = false;
    private Button answer1;
    private Button answer2;
    private Button answer3;
    private Button answer4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_t, container, false);

        answer1 = view.findViewById(R.id.answer1);
        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Pregunta 1");
                answer1.setBackgroundResource(R.drawable.roundselectanswer);
                answer1.setTextColor(getActivity().getResources().getColor(R.color.white));
                answer2.setBackgroundResource(R.drawable.roundemptyanswer);
                answer2.setTextColor(getActivity().getResources().getColor(R.color.black));
                answer3.setBackgroundResource(R.drawable.roundemptyanswer);
                answer3.setTextColor(getActivity().getResources().getColor(R.color.black));
                answer4.setBackgroundResource(R.drawable.roundemptyanswer);
                answer4.setTextColor(getActivity().getResources().getColor(R.color.black));
                correct = true;
            }
        });

        answer2 = view.findViewById(R.id.answer2);
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Pregunta 2");
                answer1.setBackgroundResource(R.drawable.roundemptyanswer);
                answer1.setTextColor(getActivity().getResources().getColor(R.color.black));
                answer2.setBackgroundResource(R.drawable.roundselectanswer);
                answer2.setTextColor(getActivity().getResources().getColor(R.color.white));
                answer3.setBackgroundResource(R.drawable.roundemptyanswer);
                answer3.setTextColor(getActivity().getResources().getColor(R.color.black));
                answer4.setBackgroundResource(R.drawable.roundemptyanswer);
                answer4.setTextColor(getActivity().getResources().getColor(R.color.black));
                correct = false;
            }
        });

        answer3 = view.findViewById(R.id.answer3);
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Pregunta 3");
                answer1.setBackgroundResource(R.drawable.roundemptyanswer);
                answer1.setTextColor(getActivity().getResources().getColor(R.color.black));
                answer2.setBackgroundResource(R.drawable.roundemptyanswer);
                answer2.setTextColor(getActivity().getResources().getColor(R.color.black));
                answer3.setBackgroundResource(R.drawable.roundselectanswer);
                answer3.setTextColor(getActivity().getResources().getColor(R.color.white));
                answer4.setBackgroundResource(R.drawable.roundemptyanswer);
                answer4.setTextColor(getActivity().getResources().getColor(R.color.black));
                correct = false;
            }
        });

        answer4 = view.findViewById(R.id.answer4);
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Pregunta 4");
                answer1.setBackgroundResource(R.drawable.roundemptyanswer);
                answer1.setTextColor(getActivity().getResources().getColor(R.color.black));
                answer2.setBackgroundResource(R.drawable.roundemptyanswer);
                answer2.setTextColor(getActivity().getResources().getColor(R.color.black));
                answer3.setBackgroundResource(R.drawable.roundemptyanswer);
                answer3.setTextColor(getActivity().getResources().getColor(R.color.black));
                answer4.setBackgroundResource(R.drawable.roundselectanswer);
                answer4.setTextColor(getActivity().getResources().getColor(R.color.white));
                correct = false;
            }
        });

        Button nextQuestion = view.findViewById(R.id.button_next);
        nextQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                System.out.println("Siguiente pregunta");
                if (correct == true) {
                    alertCorrect();
                } else if (correct == false) {
                    alertNotCorrect();
                }
            }
        });

        return view;
    }


    private void alertNotCorrect(){
        new AlertDialog.Builder(getContext())
                .setTitle("Respuesta incorrecta")
                .setMessage("Inténtelo de nuevo")

                // Specifying a listener allows you to take an action before dismissing the dialog.
                // The dialog is automatically dismissed when a dialog button is clicked.
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        resetAnswers();
                    }
                })
                // A null listener allows the button to dismiss the dialog and take no further action.
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

    private void alertCorrect(){
        new AlertDialog.Builder(getContext())
                .setTitle("¡Respuesta correcta!")
                .setMessage("Pasar a la siguiente pregunta")

                // Specifying a listener allows you to take an action before dismissing the dialog.
                // The dialog is automatically dismissed when a dialog button is clicked.
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        resetAnswers();
                        NavHostFragment.findNavController(TFragment.this)
                                .navigate(R.id.action_TFragment_to_congrats);
                    }
                })
                // A null listener allows the button to dismiss the dialog and take no further action.
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

    private void resetAnswers() {
        answer1.setBackgroundResource(R.drawable.roundemptyanswer);
        answer1.setTextColor(getActivity().getResources().getColor(R.color.black));
        answer2.setBackgroundResource(R.drawable.roundemptyanswer);
        answer2.setTextColor(getActivity().getResources().getColor(R.color.black));
        answer3.setBackgroundResource(R.drawable.roundemptyanswer);
        answer3.setTextColor(getActivity().getResources().getColor(R.color.black));
        answer4.setBackgroundResource(R.drawable.roundemptyanswer);
        answer4.setTextColor(getActivity().getResources().getColor(R.color.black));
    }
}
