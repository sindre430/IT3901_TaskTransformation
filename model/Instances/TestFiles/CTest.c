#include <stdio.h>
/*
{$var1 = random(0,10)}
*/
int main() //{multipleChoice, input:"main", options:["main", "Main", "System.main"]}
{
    int i, j, rows; 

    printf("Enter number of rows: ");
    scanf("%d",&rows);

    for(i=1; i<=rows; ++i)
    { // {movable, region:body}
        for(j=1; j<=i; ++j) // {blank, input:"j<=i"} 
        {
            printf("* ");
        }
        printf("\n"); #{edit, input:"\n", output:"\b"}
    }
    return 0;
}