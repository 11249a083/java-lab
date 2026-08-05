class largestarray{
    public static void main(String[] args){
        int[] num = {7,18,45,8,110};
        int largest = num[0];

        for(int i = 0; i< num.length; i++){
            if(num[i]>largest){
                largest = num[i];
            }
        }
        System.out.println("The largest number is :"+ largest);
    }
}