# Spring


# Code Review
## Plugin results
1. Checkstyle detected indentation, custom order imports, and imports with star
2. PMD detected unused imports 
## Fixes
1. Removed comments in Subject model
2. Reorganized imports
3. Fixed star imports
## Checkstyle results
![checkstyle](review/checkstyle.png)
## Recommendations
1. Add CRUD functionality to Subject and Group in controllers
2. Remove HashMap completely from StudentsController
## Misconfiguration
1. Some methods do not work for Subject and Group, therefore I am unable to test them
### POST method on Subjects
![subjects](review/subjects405.png)
### POST method on Groups
![groups](review/groups405.png)
