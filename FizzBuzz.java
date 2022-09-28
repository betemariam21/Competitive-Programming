class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList();
        
        for(int i =1,fizz=0,buzz=0; i<=n; i++){
            fizz++;
            buzz++;
        
        if(fizz == 3 && buzz ==5){
            fizz = 0;
            buzz = 0;
            answer.add("FizzBuzz");
        }
        else if(fizz==3){
            fizz = 0;
            answer.add("Fizz");
        }
        else if(buzz==5){
            buzz = 0;
            answer.add("Buzz");
        }
        else{
            answer.add(Integer.toString(i));
        }
        }
        return answer;
    }
}
