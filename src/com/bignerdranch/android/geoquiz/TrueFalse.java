package com.bignerdranch.android.geoquiz;

public class TrueFalse {
	
	private int mQuestion;           //Will hold resource id of question
	private boolean mTrueQuestion;   //Indicates whether question is true or false
	
	public TrueFalse(int question, boolean trueQuestion) {
	mQuestion = question;
	mTrueQuestion = trueQuestion;
	}

	public int getQuestion() {
		return mQuestion;
	}

	public void setQuestion(int question) {
		mQuestion = question;
	}

	public boolean isTrueQuestion() {
		return mTrueQuestion;
	}

	public void setTrueQuestion(boolean trueQuestion) {
		mTrueQuestion = trueQuestion;
	}
	
	

}
