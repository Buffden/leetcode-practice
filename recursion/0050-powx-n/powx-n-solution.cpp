class Solution{
public:
    double pow(double x, unsigned int y)
    {
        double res=1;
        while(y>0)
        { 
            if(y&1) 
               res=res*x; 
            y=y/2;
            x=x*x; 
        } 
        return res; 
    }
    double myPow(double x, int n){
        double p=n;
        if((x==1)||(x==0)||(n==1))
            return x;
            
        if(n==0)
            return 1;
        return (n<0)?(1/pow(x,-p)):(pow(x,p));
    }
};
