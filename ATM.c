#include<stdio.h>
int main(void)
{
    int withdraw;
    float amount, balance;
       scanf("%d", &withdraw);
       scanf("%f", &amount);
           balance = amount-withdraw-0.5;
    if(withdraw%5==0)
    {
           if(balance>0)
                printf("%0.2f", balance);
           else 
                printf("%0.2f", amount);
    } 
    else 
    {
           printf("%0.2f", amount);
    } 
    return 0;
}
