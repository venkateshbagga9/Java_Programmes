class Current
  {
    String player;
    int runs;
    double avg;
    int matches;
    Current(String player,int runs,double avg)
    {
    this.player=player;
    this.runs=runs;
    this.avg=avg;
    }
    Current(String player,int runs,double avg,int matches)
    {
      this(player,runs,avg);
      this.matches=matches;
    }
    public void display()
    {
  System.out.println("player="+player+" "+"runs="+runs+" "+"avg="+avg+" "+"matches="+matches);
    }
  }
    class Currentcric
      {
        public static void main(String args[])
        {
          Current p1=new Current("Dhoni",186,50.9);
          Current p2=new Current("Yuvraj",176,49,256);
          p1.display();
          p2.display();
        }
      }