<!DOCTYPE html>
<html>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
<body>
<div ng-app=" ">
 
<h1>Student Information:</h1>
<form>
First Name: <br/>
<input type="text" ng-model="firstName" /> <br />
 
Last Name: <br/>
<input type="text" ng-model="lastName" /> <br />
DoB: <br/>
<input type="date" ng-model="DoB" /> <br /><br />
 
Email: <br>
<input type="email" ng-model="text" ng-pattern="emailFormat"
/><br><br>
Gender: <br/>
<select id="gender" ng-model="gender">
<option value="male">Male</option>
<option value="female">Female</option>
</select><br /> <br />
Course:<br />
 
<input type="radio" ng-model="Course" value="btech" />BTech<br
/>
<input type="radio" ng-model="Course" value="bs" />BS <br /><br
 
/>
Branch: <br/>
<input type="checkbox" ng-model="cse" />CSE <br />
<input type="checkbox" ng-model="ece" />ECE <br />
<input type="checkbox" ng-model="eee" />EEE<br /><br />
<input type="submit" value="Submit" />
<input type="reset" value="Reset"/>
 
</form>
</div>
</body>
</html>