package com.example.fedunigraphicsdemos30323980.piano;


import android.media.AudioManager;
import android.media.SoundPool;
import android.view.View;

public class SoundPoolClass {

 private SoundPool soundPool;
 private int maxStreams = 12;
 private  float leftVolume = 1.0f;
 private float rightVolume = 1.0f;
 private int priority = 0;
 private int noLoop = 0;
 private float normalPlayRate = 1.0f;

 private int cNoteID;
 private int dNoteID;
 private int eNoteID;
 private int fNoteID;
 private int gNoteID;
 private int aNoteID;
 private int bNoteID;
 private int black1NoteID;
 private int black2NoteID;
 private int black3NoteID;
 private int black4NoteID;
 private int black5NoteID;


 public void initSoundPool() {

  soundPool = new SoundPool(maxStreams, AudioManager.STREAM_MUSIC, 0);

  cNoteID = soundPool.load("sfx/middle_c.wav",1 );

 }


 public void playC()
 {
 soundPool.play(cNoteID, leftVolume, rightVolume, priority, noLoop, normalPlayRate);
 }



 }
