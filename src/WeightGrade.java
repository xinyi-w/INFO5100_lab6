public class WeightGrade {
    //private variables
    private double pointTotal;
    private double earnedPoints;
    private double assignmentPercent;

    private double totalGrade;

    //initialize point total
    public void setPointTotal(double pointTotal){this.pointTotal = pointTotal;}
    //access point total
    public double getPointTotal(){return this.pointTotal;}

    //initialize earned points
    public void setEarnedPoints(double earnedPoints){this.earnedPoints = earnedPoints;}
    //access earned points
    public double getEarnedPoints(){return this.earnedPoints;}

    //initialize assignment percent
    public void setAssignmentPercent(double assignmentPercent){this.assignmentPercent = assignmentPercent;}
    //access assignment percent
    public double getAssignmentPercent(){return this.assignmentPercent;}


    public void WeightGrade(){
    }

    //Calculating the total grade
    public double getTotalGrade(){
        this.totalGrade = (double)this.earnedPoints / this.pointTotal * this.assignmentPercent;
        return this.totalGrade;
    }



}
