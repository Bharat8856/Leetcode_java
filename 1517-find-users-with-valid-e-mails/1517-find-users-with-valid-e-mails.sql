# Write your MySQL query statement below
SELECT USER_ID,NAME,MAIL FROM USERS
WHERE REGEXP_LIKE(
    mail,'^[A-Za-z][A-Za-z0-9_.-]*@leetcode[.]com$','c'
);