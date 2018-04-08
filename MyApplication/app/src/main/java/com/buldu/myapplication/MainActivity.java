package com.buldu.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.media.MediaPlayer;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView kenny;
    Button sol, sag, yukari, restart, canada;
    ConstraintLayout constraintLayout;
    ConstraintSet constraintSet;
    TextView sayacx, sayacy;
    int x = 500, y = 150;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sol = (Button) findViewById(R.id.sol);
        sag = (Button) findViewById(R.id.sag);
        yukari = (Button) findViewById(R.id.yukari);
        restart = (Button) findViewById(R.id.restart);
        canada = (Button) findViewById(R.id.canada);
        kenny = (ImageView) findViewById(R.id.kenny);
        sayacx = (TextView) findViewById(R.id.sayacx);
        sayacy = (TextView) findViewById(R.id.sayacy);
        constraintLayout = (ConstraintLayout) findViewById(R.id.sayfa);
        constraintSet = new ConstraintSet();
        constraintSet.clone(constraintLayout);
        constraintSet.setMargin(kenny.getId(), ConstraintSet.START, x);
        constraintSet.setMargin(kenny.getId(), ConstraintSet.BOTTOM, y);
        constraintSet.applyTo(constraintLayout);
        sayacx.setText(String.valueOf(x));
        sayacy.setText(String.valueOf(y));
        final MediaPlayer ses = MediaPlayer.create(this, R.raw.ses);
        sol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x-=25;
                constraintSet = new ConstraintSet();
                constraintSet.clone(constraintLayout);
                constraintSet.setMargin(kenny.getId(), ConstraintSet.START, x);
                constraintSet.applyTo(constraintLayout);
                sayacx.setText(String.valueOf(x));
                if(x==1225 && y==150){
                    final Handler handler11 = new Handler();
                    handler11.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            y-=25;
                            constraintSet = new ConstraintSet();
                            constraintSet.clone(constraintLayout);
                            constraintSet.setMargin(kenny.getId(), ConstraintSet.BOTTOM, y);
                            constraintSet.applyTo(constraintLayout);
                            sayacy.setText(String.valueOf(y));
                        }
                    }, 150);
                    final Handler handler22 = new Handler();
                    handler22.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            y-=25;
                            constraintSet = new ConstraintSet();
                            constraintSet.clone(constraintLayout);
                            constraintSet.setMargin(kenny.getId(), ConstraintSet.BOTTOM, y);
                            constraintSet.applyTo(constraintLayout);
                            sayacy.setText(String.valueOf(y));
                        }
                    }, 300);
                    final Handler handler33 = new Handler();
                    handler33.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            y-=25;
                            constraintSet = new ConstraintSet();
                            constraintSet.clone(constraintLayout);
                            constraintSet.setMargin(kenny.getId(), ConstraintSet.BOTTOM, y);
                            constraintSet.applyTo(constraintLayout);
                            sayacy.setText(String.valueOf(y));
                        }
                    }, 450);
                    final Handler handler44 = new Handler();
                    handler44.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            y-=25;
                            constraintSet = new ConstraintSet();
                            constraintSet.clone(constraintLayout);
                            constraintSet.setMargin(kenny.getId(), ConstraintSet.BOTTOM, y);
                            constraintSet.applyTo(constraintLayout);
                            sayacy.setText(String.valueOf(y));
                        }
                    }, 600);
                    final Handler handler55 = new Handler();
                    handler55.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            y-=25;
                            constraintSet = new ConstraintSet();
                            constraintSet.clone(constraintLayout);
                            constraintSet.setMargin(kenny.getId(), ConstraintSet.BOTTOM, y);
                            constraintSet.applyTo(constraintLayout);
                            sayacy.setText(String.valueOf(y));
                        }
                    }, 750);
                    final Handler handler66 = new Handler();
                    handler66.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            y-=25;
                            constraintSet = new ConstraintSet();
                            constraintSet.clone(constraintLayout);
                            constraintSet.setMargin(kenny.getId(), ConstraintSet.BOTTOM, y);
                            constraintSet.applyTo(constraintLayout);
                            sayacy.setText(String.valueOf(y));
                            ses.start();
                        }
                    }, 900);
                }
            }
        });
        sag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x+=25;
                constraintSet = new ConstraintSet();
                constraintSet.clone(constraintLayout);
                constraintSet.setMargin(kenny.getId(), ConstraintSet.START, x);
                constraintSet.applyTo(constraintLayout);
                sayacx.setText(String.valueOf(x));
                if(x==1800){
                    startActivity(new Intent(getApplicationContext(),Canada.class));
                }
                if(x==1225 && y==150){
                    final Handler handler11 = new Handler();
                    handler11.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            y-=25;
                            constraintSet = new ConstraintSet();
                            constraintSet.clone(constraintLayout);
                            constraintSet.setMargin(kenny.getId(), ConstraintSet.BOTTOM, y);
                            constraintSet.applyTo(constraintLayout);
                            sayacy.setText(String.valueOf(y));
                        }
                    }, 150);
                    final Handler handler22 = new Handler();
                    handler22.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            y-=25;
                            constraintSet = new ConstraintSet();
                            constraintSet.clone(constraintLayout);
                            constraintSet.setMargin(kenny.getId(), ConstraintSet.BOTTOM, y);
                            constraintSet.applyTo(constraintLayout);
                            sayacy.setText(String.valueOf(y));
                        }
                    }, 300);
                    final Handler handler33 = new Handler();
                    handler33.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            y-=25;
                            constraintSet = new ConstraintSet();
                            constraintSet.clone(constraintLayout);
                            constraintSet.setMargin(kenny.getId(), ConstraintSet.BOTTOM, y);
                            constraintSet.applyTo(constraintLayout);
                            sayacy.setText(String.valueOf(y));
                        }
                    }, 450);
                    final Handler handler44 = new Handler();
                    handler44.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            y-=25;
                            constraintSet = new ConstraintSet();
                            constraintSet.clone(constraintLayout);
                            constraintSet.setMargin(kenny.getId(), ConstraintSet.BOTTOM, y);
                            constraintSet.applyTo(constraintLayout);
                            sayacy.setText(String.valueOf(y));
                        }
                    }, 600);
                    final Handler handler55 = new Handler();
                    handler55.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            y-=25;
                            constraintSet = new ConstraintSet();
                            constraintSet.clone(constraintLayout);
                            constraintSet.setMargin(kenny.getId(), ConstraintSet.BOTTOM, y);
                            constraintSet.applyTo(constraintLayout);
                            sayacy.setText(String.valueOf(y));
                        }
                    }, 750);
                    final Handler handler66 = new Handler();
                    handler66.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            y-=25;
                            constraintSet = new ConstraintSet();
                            constraintSet.clone(constraintLayout);
                            constraintSet.setMargin(kenny.getId(), ConstraintSet.BOTTOM, y);
                            constraintSet.applyTo(constraintLayout);
                            sayacy.setText(String.valueOf(y));
                            ses.start();
                        }
                    }, 900);
                }
            }
        });
        yukari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Handler handler1 = new Handler();
                handler1.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        y+=25;
                        constraintSet = new ConstraintSet();
                        constraintSet.clone(constraintLayout);
                        constraintSet.setMargin(kenny.getId(), ConstraintSet.BOTTOM, y);
                        constraintSet.applyTo(constraintLayout);
                        sayacy.setText(String.valueOf(y));
                    }
                }, 150);
                final Handler handler2 = new Handler();
                handler2.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        y+=25;
                        constraintSet = new ConstraintSet();
                        constraintSet.clone(constraintLayout);
                        constraintSet.setMargin(kenny.getId(), ConstraintSet.BOTTOM, y);
                        constraintSet.applyTo(constraintLayout);
                        sayacy.setText(String.valueOf(y));
                    }
                }, 300);
                final Handler handler3 = new Handler();
                handler3.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        y+=25;
                        constraintSet = new ConstraintSet();
                        constraintSet.clone(constraintLayout);
                        constraintSet.setMargin(kenny.getId(), ConstraintSet.BOTTOM, y);
                        constraintSet.applyTo(constraintLayout);
                        sayacy.setText(String.valueOf(y));
                    }
                }, 450);
                final Handler handler4 = new Handler();
                handler4.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        y+=25;
                        constraintSet = new ConstraintSet();
                        constraintSet.clone(constraintLayout);
                        constraintSet.setMargin(kenny.getId(), ConstraintSet.BOTTOM, y);
                        constraintSet.applyTo(constraintLayout);
                        sayacy.setText(String.valueOf(y));
                    }
                }, 600);
                final Handler handler5 = new Handler();
                handler5.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        y-=25;
                        constraintSet = new ConstraintSet();
                        constraintSet.clone(constraintLayout);
                        constraintSet.setMargin(kenny.getId(), ConstraintSet.BOTTOM, y);
                        constraintSet.applyTo(constraintLayout);
                        sayacy.setText(String.valueOf(y));
                    }
                }, 750);
                final Handler handler6 = new Handler();
                handler6.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        y-=25;
                        constraintSet = new ConstraintSet();
                        constraintSet.clone(constraintLayout);
                        constraintSet.setMargin(kenny.getId(), ConstraintSet.BOTTOM, y);
                        constraintSet.applyTo(constraintLayout);
                        sayacy.setText(String.valueOf(y));
                    }
                }, 900);
                final Handler handler7 = new Handler();
                handler7.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        y-=25;
                        constraintSet = new ConstraintSet();
                        constraintSet.clone(constraintLayout);
                        constraintSet.setMargin(kenny.getId(), ConstraintSet.BOTTOM, y);
                        constraintSet.applyTo(constraintLayout);
                        sayacy.setText(String.valueOf(y));
                    }
                }, 1050);
                final Handler handler8 = new Handler();
                handler8.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        y-=25;
                        constraintSet = new ConstraintSet();
                        constraintSet.clone(constraintLayout);
                        constraintSet.setMargin(kenny.getId(), ConstraintSet.BOTTOM, y);
                        constraintSet.applyTo(constraintLayout);
                        sayacy.setText(String.valueOf(y));
                        if(x==1225 && y==150){
                            final Handler handler11 = new Handler();
                            handler11.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    y-=25;
                                    constraintSet = new ConstraintSet();
                                    constraintSet.clone(constraintLayout);
                                    constraintSet.setMargin(kenny.getId(), ConstraintSet.BOTTOM, y);
                                    constraintSet.applyTo(constraintLayout);
                                    sayacy.setText(String.valueOf(y));
                                }
                            }, 150);
                            final Handler handler22 = new Handler();
                            handler22.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    y-=25;
                                    constraintSet = new ConstraintSet();
                                    constraintSet.clone(constraintLayout);
                                    constraintSet.setMargin(kenny.getId(), ConstraintSet.BOTTOM, y);
                                    constraintSet.applyTo(constraintLayout);
                                    sayacy.setText(String.valueOf(y));
                                }
                            }, 300);
                            final Handler handler33 = new Handler();
                            handler33.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    y-=25;
                                    constraintSet = new ConstraintSet();
                                    constraintSet.clone(constraintLayout);
                                    constraintSet.setMargin(kenny.getId(), ConstraintSet.BOTTOM, y);
                                    constraintSet.applyTo(constraintLayout);
                                    sayacy.setText(String.valueOf(y));
                                }
                            }, 450);
                            final Handler handler44 = new Handler();
                            handler44.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    y-=25;
                                    constraintSet = new ConstraintSet();
                                    constraintSet.clone(constraintLayout);
                                    constraintSet.setMargin(kenny.getId(), ConstraintSet.BOTTOM, y);
                                    constraintSet.applyTo(constraintLayout);
                                    sayacy.setText(String.valueOf(y));
                                }
                            }, 600);
                            final Handler handler55 = new Handler();
                            handler55.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    y-=25;
                                    constraintSet = new ConstraintSet();
                                    constraintSet.clone(constraintLayout);
                                    constraintSet.setMargin(kenny.getId(), ConstraintSet.BOTTOM, y);
                                    constraintSet.applyTo(constraintLayout);
                                    sayacy.setText(String.valueOf(y));
                                }
                            }, 750);
                            final Handler handler66 = new Handler();
                            handler66.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    y-=25;
                                    constraintSet = new ConstraintSet();
                                    constraintSet.clone(constraintLayout);
                                    constraintSet.setMargin(kenny.getId(), ConstraintSet.BOTTOM, y);
                                    constraintSet.applyTo(constraintLayout);
                                    sayacy.setText(String.valueOf(y));
                                    ses.start();
                                }
                            }, 900);

                        }
                    }
                }, 1200);
            }
        });
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Restart();
            }
        });
        canada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Canada.class));
            }
        });
    }
    public void Restart()
    {
        this.recreate();
    }
}

