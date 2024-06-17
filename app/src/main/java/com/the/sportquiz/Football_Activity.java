package com.the.sportquiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieDrawable;

public class Football_Activity extends AppCompatActivity {


    ImageView textView1, textView2, textView3;
    TextView questionLabel;
    TextView buttonNext, buttonResult;
    ConstraintLayout constraintLayout;
    int countCorect_answer;
    private int quastion_index_football = 0;
    private int answer_index1 = 0;
    private int answer_index2 = 0;
    private int answer_index3 = 0;
    private MediaPlayer mediaPlayer;
    private Animation animation, imageanim1, imageanim2, imageanim3, next_animation, corect_wrong_anim;
    private AnimationDrawable animationDrawable;
    LottieAnimationView win, medal;


    private Football_Queshtion[] football_questions = new Football_Queshtion[]{

            new Football_Queshtion(false, true, false, R.string.quastionfootball1),
            new Football_Queshtion(false, false, true, R.string.quastionfootball2),
            new Football_Queshtion(false, true, false, R.string.quastionfootball3),
            new Football_Queshtion(false, false, true, R.string.quastionfootball4),
            new Football_Queshtion(false, false, true, R.string.quastionfootball5),
            new Football_Queshtion(false, false, true, R.string.quastionfootball6),
            new Football_Queshtion(false, true, false, R.string.quastionfootball7),
            new Football_Queshtion(false, false, true, R.string.quastionfootball8),
            new Football_Queshtion(true, false, false, R.string.quastionfootball9),
            new Football_Queshtion(false, true, false, R.string.quastionfootball10),
            new Football_Queshtion(false, true, false, R.string.quastionfootball11),
            new Football_Queshtion(false, false, true, R.string.quastionfootball12),
            new Football_Queshtion(false, false, true, R.string.quastionfootball13),
            new Football_Queshtion(false, false, true, R.string.quastionfootball14),
            new Football_Queshtion(true, false, false, R.string.quastionfootball15),
            new Football_Queshtion(false, false, true, R.string.quastionfootball16),
            new Football_Queshtion(true, false, false, R.string.quastionfootball17),
            new Football_Queshtion(false, true, false, R.string.quastionfootball18),
            new Football_Queshtion(false, false, true, R.string.quastionfootball19),
            new Football_Queshtion(true, false, false, R.string.quastionfootball20),
    };

    private Football_answer1[] answer1 = new Football_answer1[]{

            new Football_answer1(R.drawable.ronaldinho),
            new Football_answer1(R.drawable.beckhem),
            new Football_answer1(R.drawable.venus),
            new Football_answer1(R.drawable.alonso),
            new Football_answer1(R.drawable.barcelona),
            new Football_answer1(R.drawable.cup2),
            new Football_answer1(R.drawable.virjinvandijk),
            new Football_answer1(R.drawable.maradonna),
            new Football_answer1(R.drawable.agasi),
            new Football_answer1(R.drawable.roma),
            new Football_answer1(R.drawable.raykoner),
            new Football_answer1(R.drawable.mbape),
            new Football_answer1(R.drawable.lukamodrich),
            new Football_answer1(R.drawable.casilias),
            new Football_answer1(R.drawable.erlinghalland),
            new Football_answer1(R.drawable.kurtua),
            new Football_answer1(R.drawable.hamilton),
            new Football_answer1(R.drawable.copybraent),
            new Football_answer1(R.drawable.zidane),
            new Football_answer1(R.drawable.jordan),
    };

    private Football_answer2[] answer2 = new Football_answer2[]{
            new Football_answer2(R.drawable.messi),
            new Football_answer2(R.drawable.cafu),
            new Football_answer2(R.drawable.serena),
            new Football_answer2(R.drawable.buffon),
            new Football_answer2(R.drawable.juventus),
            new Football_answer2(R.drawable.cup3),
            new Football_answer2(R.drawable.nadal),
            new Football_answer2(R.drawable.vinisius),
            new Football_answer2(R.drawable.bartez),
            new Football_answer2(R.drawable.milan),
            new Football_answer2(R.drawable.senna),
            new Football_answer2(R.drawable.ramos),
            new Football_answer2(R.drawable.levandovsli),
            new Football_answer2(R.drawable.canavaro),
            new Football_answer2(R.drawable.grizman),
            new Football_answer2(R.drawable.ibragimovich),
            new Football_answer2(R.drawable.maldinni),
            new Football_answer2(R.drawable.bolt),
            new Football_answer2(R.drawable.figo),
            new Football_answer2(R.drawable.tigerwoods),
    };

    private Football_answer3[] answer3 = new Football_answer3[]{
            new Football_answer3(R.drawable.henry),
            new Football_answer3(R.drawable.ronaldo),
            new Football_answer3(R.drawable.sharapova),
            new Football_answer3(R.drawable.federer),
            new Football_answer3(R.drawable.realmadrid),
            new Football_answer3(R.drawable.worldcup),
            new Football_answer3(R.drawable.djokovich),
            new Football_answer3(R.drawable.pele),
            new Football_answer3(R.drawable.neymar),
            new Football_answer3(R.drawable.chelse),
            new Football_answer3(R.drawable.platini),
            new Football_answer3(R.drawable.robertocarlos),
            new Football_answer3(R.drawable.etto),
            new Football_answer3(R.drawable.benzema),
            new Football_answer3(R.drawable.harrykane),
            new Football_answer3(R.drawable.moxamedsallah),
            new Football_answer3(R.drawable.nedved),
            new Football_answer3(R.drawable.delpiero),
            new Football_answer3(R.drawable.cruyff),
            new Football_answer3(R.drawable.shumaxer),
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_football);

        constraintLayout = findViewById(R.id.const_id);
        questionLabel = findViewById(R.id.questionLabel);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);

        buttonNext = findViewById(R.id.buttonNext);
        buttonResult = findViewById(R.id.buttonResult);
        win = findViewById(R.id.win);
        medal = findViewById(R.id.medal);
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.hayahaya);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();


        animation = AnimationUtils.loadAnimation(Football_Activity.this, R.anim.animation);
        next_animation = AnimationUtils.loadAnimation(Football_Activity.this, R.anim.next_animation);

        imageanim1 = AnimationUtils.loadAnimation(Football_Activity.this, R.anim.imageanim1);
        imageanim2 = AnimationUtils.loadAnimation(Football_Activity.this, R.anim.imageanim2);
        imageanim3 = AnimationUtils.loadAnimation(Football_Activity.this, R.anim.imageanim3);
        corect_wrong_anim = AnimationUtils.loadAnimation(Football_Activity.this, R.anim.corect_wrong_anim);

        animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setEnterFadeDuration(5000);
        animationDrawable.start();


        questionLabel.startAnimation(animation);
        textView1.startAnimation(imageanim1);
        textView2.startAnimation(imageanim2);
        textView3.startAnimation(imageanim3);


        questionLabel.setText(football_questions[quastion_index_football].getQuestion());

        textView1.setImageResource(answer1[answer_index1].getAnswer2());
        textView2.setImageResource(answer2[answer_index2].getAnswer1());
        textView3.setImageResource(answer3[answer_index3].getAnswer1());

        buttonNext.setVisibility(View.INVISIBLE);


        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                questionLabel.setVisibility(View.INVISIBLE);
                checkAnswer(true);
                if (quastion_index_football == football_questions.length - 1) {

                    buttonNext.setVisibility(View.GONE);
                    buttonResult.setVisibility(View.VISIBLE);


                } else {
                    buttonNext.setVisibility(View.VISIBLE);
                    buttonNext.startAnimation(next_animation);


                }


            }


        });


        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                questionLabel.setVisibility(View.INVISIBLE);
                checkAnswer2(true);
                if (quastion_index_football == football_questions.length - 1) {


                    buttonNext.setVisibility(View.GONE);
                    buttonResult.setVisibility(View.VISIBLE);


                } else {
                    buttonNext.setVisibility(View.VISIBLE);
                    buttonNext.startAnimation(next_animation);


                }


            }
        });


        textView3.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View view) {
                                             questionLabel.setVisibility(View.INVISIBLE);
                                             checkAnswer3(true);
                                             if (quastion_index_football == football_questions.length - 1) {

                                                 buttonNext.setVisibility(View.GONE);
                                                 buttonResult.setVisibility(View.VISIBLE);


                                             } else {
                                                 buttonNext.setVisibility(View.VISIBLE);
                                                 buttonNext.startAnimation(next_animation);


                                             }


                                         }
                                     }
        );


        buttonNext.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                questionLabel.setVisibility(View.VISIBLE);
                questionLabel.startAnimation(animation);
                textView1.startAnimation(imageanim1);
                textView2.startAnimation(imageanim2);
                textView3.startAnimation(imageanim3);
                textView1.setClickable(true);
                textView2.setClickable(true);
                textView3.setClickable(true);


                boolean b = answer_index1 != answer1.length - 1;
                boolean c = answer_index2 != answer2.length - 1;
                boolean d = answer_index3 != answer3.length - 1;

                quastion_index_football++;
                answer_index1++;
                answer_index2++;
                answer_index3++;

                questionLabel.setText(football_questions[quastion_index_football].getQuestion());
                textView1.setImageResource(answer1[answer_index1].getAnswer2());
                textView2.setImageResource(answer2[answer_index2].getAnswer1());
                textView3.setImageResource(answer3[answer_index3].getAnswer1());


                buttonNext.setVisibility(View.INVISIBLE);

                textView1.setVisibility(View.VISIBLE);
                textView2.setVisibility(View.VISIBLE);
                textView3.setVisibility(View.VISIBLE);


            }


        });

        buttonResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (countCorect_answer == 20) {

                    questionLabel.setVisibility(View.VISIBLE);
                    questionLabel.setText("Excellent result, you are a sports connoisseur: " + countCorect_answer + "/" + football_questions.length);

                    buttonResult.setVisibility(View.GONE);
                    textView1.setVisibility(View.GONE);
                    textView2.setVisibility(View.GONE);
                    textView3.setVisibility(View.GONE);

                    win.setVisibility(View.VISIBLE);
                    win.setMinProgress(0.0f);
                    win.setMaxProgress(0.59f);
                    win.setRepeatCount(LottieDrawable.INFINITE);
                    win.setRepeatMode(LottieDrawable.REVERSE);
                    win.playAnimation();


                } else if (countCorect_answer > 15 && countCorect_answer <= 20) {
                    questionLabel.setVisibility(View.VISIBLE);
                    questionLabel.setText("Congratulations, you are almost a sports connoisseur: " + countCorect_answer + "/" + football_questions.length);

                    buttonResult.setVisibility(View.GONE);
                    textView1.setVisibility(View.GONE);
                    textView2.setVisibility(View.GONE);
                    textView3.setVisibility(View.GONE);

                    medal.setVisibility(View.VISIBLE);
                    medal.setMinProgress(0.0f);
                    medal.setMaxProgress(0.59f);
                    medal.setRepeatCount(LottieDrawable.INFINITE);
                    medal.setRepeatMode(LottieDrawable.REVERSE);
                    medal.playAnimation();


                } else if (countCorect_answer > 10 && countCorect_answer <= 15) {
                    questionLabel.setVisibility(View.VISIBLE);
                    questionLabel.setText("Congratulations, try again: " + countCorect_answer + "/" + football_questions.length);


                    buttonResult.setVisibility(View.GONE);
                    textView1.setVisibility(View.GONE);
                    textView2.setVisibility(View.GONE);
                    textView3.setVisibility(View.GONE);

                    medal.setVisibility(View.VISIBLE);
                    medal.setMinProgress(0.0f);
                    medal.setMaxProgress(0.59f);
                    medal.setRepeatCount(LottieDrawable.INFINITE);
                    medal.setRepeatMode(LottieDrawable.REVERSE);
                    medal.playAnimation();


                } else {
                    questionLabel.setVisibility(View.VISIBLE);
                    questionLabel.setText(" You can further develop your knowledge: " + countCorect_answer + "/" + football_questions.length);

                    buttonResult.setVisibility(View.GONE);
                    textView1.setVisibility(View.GONE);
                    textView2.setVisibility(View.GONE);
                    textView3.setVisibility(View.GONE);


                }

            }
        });

    }


    private void checkAnswer(boolean answer) {
        if (answer == football_questions[quastion_index_football].getAnswerOne()) {
            textView1.startAnimation(corect_wrong_anim);
            textView1.setImageResource(R.drawable.chekc);
            textView2.setClickable(false);
            textView3.setClickable(false);

            countCorect_answer++;


        } else {
            textView1.startAnimation(corect_wrong_anim);
            textView1.setImageResource(R.drawable.cancel);
            textView2.setClickable(false);
            textView3.setClickable(false);

        }

    }


    private void checkAnswer2(boolean answer2) {
        if (answer2 == football_questions[quastion_index_football].getAnswerTwo()) {
            textView1.startAnimation(corect_wrong_anim);
            textView2.setImageResource(R.drawable.chekc);
            textView1.setClickable(false);
            textView3.setClickable(false);
            countCorect_answer++;

        } else {
            textView1.startAnimation(corect_wrong_anim);
            textView2.setImageResource(R.drawable.cancel);
            textView1.setClickable(false);
            textView3.setClickable(false);

        }

    }

    private void checkAnswer3(boolean answer3) {
        if (answer3 == football_questions[quastion_index_football].getAnswerThree()) {
            textView1.startAnimation(corect_wrong_anim);
            textView3.setImageResource(R.drawable.chekc);
            textView1.setClickable(false);
            textView2.setClickable(false);
            countCorect_answer++;

        } else {
            textView1.startAnimation(corect_wrong_anim);
            textView3.setImageResource(R.drawable.cancel);
            textView1.setClickable(false);
            textView2.setClickable(false);

        }


    }





    @Override
    protected void onPause() {
        super.onPause();

        mediaPlayer.stop();
    }



}