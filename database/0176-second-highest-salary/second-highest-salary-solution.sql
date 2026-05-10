# Write your MySQL query statement below
SELECT(
    SELECT DISTINCT salary
    FROM Employee
    ORDER BY salary DESC
    limit 1 OFFSET 1
) AS SecondHighestSalary;
# hint: If there is no second salary, the subquery returns no value, so the outer query outputs NULL in one row.
