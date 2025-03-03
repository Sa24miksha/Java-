package JML1.Tasks.Task02;

@FunctionalInterface
interface BonusCalculator {
    double calculateBonus(double salary);
}

//class Solution implements BonusCalculator{
//    @Override
//    public double calculateBonus(double salary){
//        return salary * 0.15;
//    }
//}