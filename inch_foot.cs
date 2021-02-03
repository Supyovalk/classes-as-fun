class InchFoot{
int inch,foot;
public InchFoot(int foot,int inch){
  this.inch=inch%12;
  this.foot=foot+inch/12;
}
}
