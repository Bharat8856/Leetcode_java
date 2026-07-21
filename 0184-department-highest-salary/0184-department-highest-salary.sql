SELECT D.NAME AS Department,
       E.NAME AS Employee,
       E.SALARY AS Salary
FROM Employee E
JOIN Department D
ON D.ID = E.DepartmentId
WHERE NOT EXISTS (
    SELECT *
    FROM Employee E2
    WHERE E.DepartmentId = E2.DepartmentId
      AND E.Salary < E2.Salary
);