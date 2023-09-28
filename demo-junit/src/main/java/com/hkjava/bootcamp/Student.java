package com.hkjava.bootcamp;

import java.util.ArrayList;
import java.util.List;

public class Student {
  @NonNull
  List<Subject> subjects;

  public Student() {
    subjects = new ArrayList<>();
  }

  public List<Subject> getSubjects(){
    return this.subjects;
  }

}
