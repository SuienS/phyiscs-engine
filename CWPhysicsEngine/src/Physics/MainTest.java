package Physics;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class MainTest {
	//initial velocity vectors and gravity vectors for Problem A and B
	static Vector2D inVelVector2D;
	static Vector2D gravVector2D;
	static Vector3D inVelVector3D;
	static Vector3D gravVector3D;

	public static void main(String[] args) {
		testMenu();
	}
	
	//console menu
	public static void testMenu(){
		System.out.println("===================================");
		System.out.println("---------- Main Test Menu ---------");
		System.out.println("===================================");
		System.out.println("1. Vector 2D Test");
		System.out.println("2. Vector 3D Test");
		System.out.println("3. Problem A");
		System.out.println("4. Problem B");
		System.out.println("5. Problem C");
		Scanner scn = new Scanner(System.in);
		System.out.println("Choose number from menu... or 0 to exit");
		int choice = scn.nextInt();
		
		//redirecting to the chosen option
		switch(choice){
		
		case 1:
			testMenu2D();
			confirm();
		break;
		
		case 2:
			testMenu3D();
			confirm();
		break;
		
		case 3:
			problemA();
			confirm();
		break;
		
		case 4:
			problemB();
			confirm();
		break;
		
		case 5:
			problemC();
			confirm();
		break;
		default:System.exit(0);
		
		}

	}
	
	//menu for testing 2D Vector Engine
	public static void testMenu2D(){
		System.out.println("===================================");
		System.out.println("----------- Test Menu 2D ----------");
		System.out.println("===================================");
		System.out.println("1. Add Vectors");
		System.out.println("2. Substract Vectors");
		System.out.println("3. Dot Product Vectors");
		System.out.println("4. Unit Normal Vector");
		System.out.println("5. Rotate Vectors");
		System.out.println("6. Magnitude Vector");
		System.out.println("7. Scalar Multiple Vector");
		System.out.println("8. Velocity Vector");
		Scanner scn = new Scanner(System.in);
		System.out.println("Choose number from menu... or 0 to Main Menu");
		int choice = scn.nextInt();
		
		switch(choice){
		
		case 1:
			//getting user inputs
			//add vectors
			System.out.println("Enter vector1 X");
			float VecX1 = scn.nextFloat();
			System.out.println("Enter vector1 Y");
			float VecY1 = scn.nextFloat();
			System.out.println("Enter vector2 X");
			float VecX2 = scn.nextFloat();
			System.out.println("Enter vector2 Y");
			float VecY2 = scn.nextFloat();
			Vector2D vec1 = new Vector2D(VecX1, VecY1);//creating new vector objects
			Vector2D vec2 = new Vector2D(VecX2, VecY2);
			printVector(Vector2DMaths.addVectors(vec1, vec2));//printing the result vector
			
		break;
		
		case 2:
			//substract vectors
			System.out.println("Enter vector1 X");
			VecX1 = scn.nextFloat();
			System.out.println("Enter vector1 Y");
			VecY1 = scn.nextFloat();
			System.out.println("Enter vector2 X");
			VecX2 = scn.nextFloat();
			System.out.println("Enter vector2 Y");
			VecY2 = scn.nextFloat();
			vec1 = new Vector2D(VecX1, VecY1);
			vec2 = new Vector2D(VecX2, VecY2);
			printVector(Vector2DMaths.subVectors(vec1, vec2));
		break;
		
		case 3:
			//dot product fo 2D vectors
			System.out.println("Enter vector1 X");
			VecX1 = scn.nextFloat();
			System.out.println("Enter vector1 Y");
			VecY1 = scn.nextFloat();
			System.out.println("Enter vector2 X");
			VecX2 = scn.nextFloat();
			System.out.println("Enter vector2 Y");
			VecY2 = scn.nextFloat();
			vec1 = new Vector2D(VecX1, VecY1);
			vec2 = new Vector2D(VecX2, VecY2);
			System.out.println("========================");
			System.out.println("Dot Product :- "+Vector2DMaths.dotProdVectors(vec1, vec2));
			System.out.println("========================");

		break;
		
		case 4:
			//Normalized vectors
			System.out.println("Enter vector1 X");
			VecX1 = scn.nextFloat();
			System.out.println("Enter vector1 Y");
			VecY1 = scn.nextFloat();			
			vec1 = new Vector2D(VecX1, VecY1);
			printVector(Vector2DMaths.unitNormVector(vec1));
		break;
		
		case 5:
			//rotate vectors
			System.out.println("Enter vector1 X");
			VecX1 = scn.nextFloat();
			System.out.println("Enter vector1 Y");
			VecY1 = scn.nextFloat();
			System.out.println("Enter angle");
			double angle = scn .nextDouble();
			vec1 = new Vector2D(VecX1, VecY1);
			printVector(Vector2DMaths.rotateVector(vec1, angle));
		break;
		case 6:
			//magnitude of vector
			System.out.println("Enter vector1 X");
			VecX1 = scn.nextFloat();
			System.out.println("Enter vector1 Y");
			VecY1 = scn.nextFloat();
			vec1 = new Vector2D(VecX1, VecY1);
			System.out.println("========================");
			System.out.println("Magnitude :- "+Vector2DMaths.magnitudeVector(vec1));
			System.out.println("========================");

		break;
		case 7:
			//scaler multiple of vectors
			System.out.println("Enter vector1 X");
			VecX1 = scn.nextFloat();
			System.out.println("Enter vector1 Y");
			VecY1 = scn.nextFloat();
			System.out.println("Enter scaler multiple");
			float scaler = scn.nextFloat();
			vec1 = new Vector2D(VecX1, VecY1);
			printVector(Vector2DMaths.multipleVector(vec1, scaler));;
		break;
		case 8:
			//velocity vector
			System.out.println("Enter velocity");
			float vel = scn.nextFloat();
			System.out.println("Enter angle");
			double ang = scn.nextFloat();
			Vector2D velVector = Vector2DMaths.velocityVector(vel, ang);
			printVector(velVector);
		break;
		default:testMenu();
		}
	}
	//menu for testing 3D Vector Engine
	public static void testMenu3D(){
		System.out.println("===================================");
		System.out.println("----------- Test Menu 3D ----------");
		System.out.println("===================================");
		System.out.println("1. Add Vectors");
		System.out.println("2. Substract Vectors");
		System.out.println("3. Dot Product Vectors");
		System.out.println("4. Unit Normal Vectors");
		System.out.println("5. Magnitude Vectors");
		System.out.println("6. Scalar Multiple Vector");
		Scanner scn = new Scanner(System.in);
		System.out.println("Choose number from menu... or 0 to Main Menu");
		int choice = scn.nextInt();
		
switch(choice){
		
		case 1:
			System.out.println("Enter vector1 X");
			float VecX1 = scn.nextFloat();
			System.out.println("Enter vector1 Y");
			float VecY1 = scn.nextFloat();
			System.out.println("Enter vector1 Z");
			float VecZ1 = scn.nextFloat();
			System.out.println("Enter vector2 X");
			float VecX2 = scn.nextFloat();
			System.out.println("Enter vector2 Y");
			float VecY2 = scn.nextFloat();
			System.out.println("Enter vector2 Z");
			float VecZ2 = scn.nextFloat();
			Vector3D vec1 = new Vector3D(VecX1, VecY1,VecZ1);
			Vector3D vec2 = new Vector3D(VecX2, VecY2,VecZ2);
			printVector(Vector3DMaths.addVectors(vec1, vec2));
			
		break;
		
		case 2:
			System.out.println("Enter vector1 X");
			VecX1 = scn.nextFloat();
			System.out.println("Enter vector1 Y");
			VecY1 = scn.nextFloat();
			System.out.println("Enter vector1 Z");
			VecZ1 = scn.nextFloat();
			System.out.println("Enter vector2 X");
			VecX2 = scn.nextFloat();
			System.out.println("Enter vector2 Y");
			VecY2 = scn.nextFloat();
			System.out.println("Enter vector2 Z");
			VecZ2 = scn.nextFloat();
			vec1 = new Vector3D(VecX1, VecY1,VecZ1);
			vec2 = new Vector3D(VecX2, VecY2,VecZ2);
			printVector(Vector3DMaths.subVectors(vec1, vec2));
		break;
		
		case 3:
			System.out.println("Enter vector1 X");
			VecX1 = scn.nextFloat();
			System.out.println("Enter vector1 Y");
			VecY1 = scn.nextFloat();
			System.out.println("Enter vector1 Z");
			VecZ1 = scn.nextFloat();
			System.out.println("Enter vector2 X");
			VecX2 = scn.nextFloat();
			System.out.println("Enter vector2 Y");
			VecY2 = scn.nextFloat();
			System.out.println("Enter vector2 Z");
			VecZ2 = scn.nextFloat();
			vec1 = new Vector3D(VecX1, VecY1,VecZ1);
			vec2 = new Vector3D(VecX2, VecY2,VecZ2);
			System.out.println("========================");
			System.out.println("Dot Product : "+Vector3DMaths.dotProdVectors(vec1, vec2));
			System.out.println("========================");

		break;
		
		case 4:
			System.out.println("Enter vector1 X");
			VecX1 = scn.nextFloat();
			System.out.println("Enter vector1 Y");
			VecY1 = scn.nextFloat();
			System.out.println("Enter vector1 Z");
			VecZ1 = scn.nextFloat();			
			vec1 = new Vector3D(VecX1, VecY1,VecZ1);
			printVector(Vector3DMaths.unitNormVector(vec1));
		break;
		
		case 5:
			System.out.println("Enter vector1 X");
			VecX1 = scn.nextFloat();
			System.out.println("Enter vector1 Y");
			VecY1 = scn.nextFloat();
			System.out.println("Enter vector1 Z");
			VecZ1 = scn.nextFloat();			
			vec1 = new Vector3D(VecX1, VecY1,VecZ1);
			System.out.println("========================");
			System.out.println("Magnitude : "+Vector3DMaths.magnitudeVector(vec1));
			System.out.println("========================");

		break;
		case 6:
			System.out.println("Enter vector1 X");
			VecX1 = scn.nextFloat();
			System.out.println("Enter vector1 Y");
			VecY1 = scn.nextFloat();
			System.out.println("Enter vector1 Z");
			VecZ1 = scn.nextFloat();
			System.out.println("Enter scaler multiple");
			float scaler = scn.nextFloat();
			vec1 = new Vector3D(VecX1, VecY1,VecZ1);
			printVector(Vector3DMaths.multipleVector(vec1, scaler));
		break;
		
		default:testMenu();
		}
	}
	
	//method for printing vectors to the console
	public static void printVector(Vector2D vec){
		System.out.println("=====================");
		System.out.println("Answer : "+"("+ vec.x +","+ vec.y+ ")");
		System.out.println("=====================");

	}
	
	public static void printVector(Vector3D vec){
		System.out.println("========================");
		System.out.println("Answer : "+"("+vec.x+","+vec.y+","+vec.z+")");
		System.out.println("========================");

	}
	
	//ANSWER FOR PROBLEM A
	public static void problemA(){
		/**MAIN EQUATION ==> V = U + AT */
		
		gravVector2D = new Vector2D(0, -9.81f);//SETTING GRAVITY VECTOR
		Scanner scn = new Scanner(System.in);
		//GETTING VELOCITY AND THE ANGLEFROM THE USER
		System.out.println("Enter velocity (ms-1):-");
		float velocity = scn.nextFloat();
		System.out.println("Enter angle (degrees):-");
		double angle = scn.nextFloat();
		
		float timeStep = 0.02f;//SETTING TIME STEP
		float time = 0.00f;//VALIABLE FOR CALCULATE TOTAL TIME
		boolean hitGround = false;//STORES WHETHER IT HAS HIT THE GROUND OR NOT
		
		inVelVector2D = Vector2DMaths.velocityVector(velocity, angle);//SETTING THE INITIAL 2D VELOCITY VECTOR
		
		//SAVING INITIAL VELOCITY VECTOR TO ANOTHER TEMPERARY VARIABLES FOR CALCULATIONS WHICH WILL CHANGE IN EVERY TIME STEP
		Vector2D tempVelVector = new Vector2D(inVelVector2D.x,inVelVector2D.y);
		Vector2D tempPosVector = new Vector2D();
		Vector2D preTempPosVector = new Vector2D();
		Vector2D preTempVelVector ;
		Vector2D gravMVector = Vector2DMaths.multipleVector(gravVector2D, timeStep); //DECELERATION FROM GRAVITY FOR THE TIME STEP //V = U + (AT)<==this will calculate here 
    	System.out.println("=======================================================================================");
    	System.out.printf("|| %14s ||%14s ||%14s ||%14s ||%14s ||\n","Y-Pos Vector","X-Pos Vector","Y-Vel Vector","X-Vel Vector","Eplased Time(s)");
    	System.out.println("=======================================================================================");
    	float maxHeight=0;
    	while(!hitGround){
    		if(tempPosVector.y>=0){
    			//PRINTING ALL THE VECTOR COMPONENTS TO THE CONSOLE
    			System.out.printf("|| %14.4f ||%14.4f ||%14.4f ||%14.4f ||%14.4f ||\n",tempPosVector.y,tempPosVector.x,tempVelVector.y,tempVelVector.x,time);
	    		time+=timeStep;//ADDING TIME
	    		preTempVelVector = new Vector2D(tempVelVector.x, tempVelVector.y);
		    	tempVelVector = Vector2DMaths.addVectors(preTempVelVector, gravMVector);// V = (U) + (AT)
		    	preTempPosVector = new Vector2D(tempPosVector.x, tempPosVector.y);
				Vector2D posDifference = Vector2DMaths.multipleVector(tempVelVector, timeStep);//CHANGE OF THE PLACE FOR THE TIME STEP ==> POSITION_DIFFERENCE
		    	tempPosVector = Vector2DMaths.addVectors(preTempPosVector, posDifference);// POSITION_NEW = POSITION_OLD + POSITION_DIFFERENCE
		    	//CHECKING FOR THE MAX HEIGHT
		    	if(tempPosVector.y>maxHeight){
		    		maxHeight=tempPosVector.y;
		    	}
		    	
	    	}else{
	    		//SHORTENING TIME STEP IF Y-POSITION GOES BELOW ZERO(AS IT IS IMPOSSIBLE TO HAPPEN IN REAL)
		    	timeStep = Math.abs(preTempPosVector.y/tempVelVector.y);
	    		time+=timeStep;
	    		hitGround=true;
	    		Vector2D posDifference = Vector2DMaths.multipleVector(tempVelVector, timeStep);
		    	tempPosVector = Vector2DMaths.addVectors(preTempPosVector, posDifference);
    			System.out.printf("|| %14.4f ||%14.4f ||%14.4f ||%14.4f ||%14.4f ||\n",tempPosVector.y,tempPosVector.x,tempVelVector.y,tempVelVector.x,time);

	    	}
    		
	    	
	    	
    	}
    	//PRINTING A SHORT SUMMERY OF THE MOTION TO THE CONSOLE
		System.out.println("================================================================================================");
		System.out.println("----------------------------------------- Summery ----------------------------------------------");
		System.out.println("================================================================================================");
		System.out.println("Max Height : "+maxHeight+" m");
		System.out.println("Time Flight : "+time+" s");
		System.out.println("Range : "+tempPosVector.x+" m");
		System.out.println("================================================================================================");

	}
	
	
	//ANSWER FOR THE PROBLRM B
	public static void problemB(){
		/**MAIN EQUATION ==> V = U + AT */
		/**OTHER EQUATIONS ==> I / FT = M deltaV */ //TO FIND THE INITIAL VELOCITY

		
		
		gravVector3D = new Vector3D(0, -9.81f,0); //3D GRAVITY VECTOR
		Scanner scn = new Scanner(System.in);
		//GETTING USER INPUTS TO THE FORCE GIVEN , IMPLUSE TIME, MASS OF THE PROJECTILE
		System.out.println("Enter Force X (Newtons):-");
		float forceX = scn.nextFloat();
		System.out.println("Enter Force Y (Newtons): ");
		float forceY = scn.nextFloat();
		System.out.println("Enter Force Z (Newtons): ");
		float forceZ = scn.nextFloat();
		System.out.println("Enter impulse time (s): ");
		float forceTime = scn.nextFloat();
		System.out.println("Enter mass of the projectile (kg): ");
		float mass = scn.nextFloat();
		float absForceY = forceY + (mass*gravVector3D.y);// F = MA  ==> FINDING RESULTANT Y-VECTOR BY SUBSTRACTING THE WEIGHT OF THE PROJECTILE

		Vector3D forceVec = new Vector3D(forceX,absForceY,forceZ);//CREATING INITIAL FORCE VECTOR
		Vector3D impluseVec = Vector3DMaths.multipleVector(forceVec, forceTime);// CALCULATING IMPULSE
		inVelVector3D=Vector3DMaths.multipleVector(impluseVec, (1.0f/mass) );// CALCULATING INITIAL 3D VELOCITY VECTOR WHICH PRODUCED BY THE IMPULSE GIVEN
		
		float timeStep = 0.02f;//SETTING TIME STEP
		float time = 0.00f;//VALIABLE FOR CALCULATE TOTAL TIME
		boolean hitGround = false;	//STORES WHETHER IT HAS HIT THE GROUND OR NOT	
		
		System.out.println("Initial Velocity : "+Vector3DMaths.magnitudeVector(inVelVector3D));//PRINTING THE INITIAL VELOCITY
		
		//SAVING INITIAL 3D VELOCITY VECTOR TO ANOTHER TEMPERARY VARIABLES FOR CALCULATIONS WHICH WILL CHANGE IN EVERY TIME STEP
		Vector3D tempVelVector = new Vector3D(inVelVector3D.x,inVelVector3D.y,inVelVector3D.z);
		Vector3D tempPosVector = new Vector3D();
		Vector3D preTempPosVector = new Vector3D();
		Vector3D preTempVelVector;
		Vector3D gravMVector = Vector3DMaths.multipleVector(gravVector3D, timeStep);//DECELERATION FROM GRAVITY FOR THE TIME STEP //V = U + (AT)<==this will calculate here
    	System.out.println("=========================================================================================================================");
    	System.out.printf("|| %14s ||%14s ||%14s ||%14s ||%14s ||%14s ||%14s ||\n","Y-Pos Vector","X-Pos Vector","Z-Pos Vector","Y-Vel Vector","X-Vel Vector","Z-Vel Vector","Eplased Time(s)");
    	System.out.println("=========================================================================================================================");
    	
    	float maxHeight=0;

    	while(!hitGround){
    		if(tempPosVector.y>=0){
    			//PRINTING ALL THE VECTOR COMPONENTS TO THE CONSOLE
    			System.out.printf("|| %14.4f ||%14.4f ||%14.4f ||%14.4f ||%14.4f ||%14.4f ||%14.4f ||\n",tempPosVector.y,tempPosVector.x,tempPosVector.z,tempVelVector.y,tempVelVector.x,tempVelVector.z,time);
	    		time+=timeStep;//ADDING TIME
	    		preTempVelVector = new Vector3D(tempVelVector.x, tempVelVector.y, tempVelVector.z);
		    	tempVelVector = Vector3DMaths.addVectors(preTempVelVector, gravMVector);// V = (U) + (AT)
		    	preTempPosVector = new Vector3D(tempPosVector.x, tempPosVector.y, tempPosVector.z);
				Vector3D posDifference = Vector3DMaths.multipleVector(tempVelVector, timeStep);//CHANGE OF THE PLACE FOR THE TIME STEP ==> POSITION_DIFFERENCE
		    	tempPosVector = Vector3DMaths.addVectors(preTempPosVector, posDifference);// POSITION_NEW = POSITION_OLD + POSITION_DIFFERENCE
		    	//FINDING THE MAX HEIGHT
		    	if(tempPosVector.y>maxHeight){
		    		maxHeight=tempPosVector.y;
		    	}
		    	
	    	}else{
	    		//SHORTENING TIME-STEP IF Y-POSITION GOES BELOW ZERO(AS IT IS IMPOSSIBLE TO HAPPEN IN REAL)
		    	timeStep = Math.abs(preTempPosVector.y/tempVelVector.y);
	    		time+=timeStep;
	    		hitGround=true;//SETTING GROUND HIT TRUE
	    		Vector3D posDifference = Vector3DMaths.multipleVector(tempVelVector, timeStep);
		    	tempPosVector = Vector3DMaths.addVectors(preTempPosVector, posDifference);
    			System.out.printf("|| %14.4f ||%14.4f ||%14.4f ||%14.4f ||%14.4f ||%14.4f ||%14.4f ||\n",tempPosVector.y,tempPosVector.x,tempPosVector.z,tempVelVector.y,tempVelVector.x,tempVelVector.z,time);

	    	}
    		
	    	
	    	
    	}
    	//SHOWING A SHORT SUMMERY OF THE MOTION
    	System.out.println("===================================================================================================================");
		System.out.println("------------------------------------------------- Summery ---------------------------------------------------------");
		System.out.println("===================================================================================================================");
		System.out.println("Max Height : "+maxHeight+" m");
		System.out.println("Time Flight : "+time+" s");
		System.out.println("Range : "+Vector2DMaths.magnitudeVector(new Vector2D(tempPosVector.x, tempPosVector.z))+" m"); //CALCULATING RANGE BY X AND Z COORDINATES 
		System.out.println("===================================================================================================================");

    	
	}
	
	
	//ANSWER FOR THE PROBLEM C
	public static void problemC(){
		float radiusBall = 0.0026f;//RADIUS OF THE BALL
		Scanner scn = new Scanner(System.in);
		//GETTING USER INPUT FOR HITTING ANGLE
		System.out.println("Enter striking angle (degrees):-");
		Double angleHit = scn.nextDouble();
		Double angleHitRad = Math.toRadians(angleHit);//CONVERTING TO RADIANS
		//FINDING THE PLACE TO POSITION CUE BALL IN ORDER TO HIT THE OBJECT BALL IN GIVEN ANGLE
		float posXofCueBall = (float) ( (radiusBall*2) * Math.cos( angleHitRad ) );
		float posYofCueBall = -1.0f;//Y LENGTH TO OBJECT BALL FROM CUE BALL
		float timeStep=0.02f;//SETTING TIME STEP
		float time=0;//FOR SAVING TOTAL TIME
		
		//CREATING NEW POSITON AND INIIAL VELOCITY VECTOR OF THE CUE BALL
		Vector2D posVectorCue= new Vector2D(posXofCueBall,posYofCueBall);
		Vector2D prePosVectorCue;
		Vector2D velVectorCue= new Vector2D(0,4.0f);
		Vector2D preVelVectorCue;
		
		Vector2D posVectorObj= new Vector2D();
		Vector2D prePosVectorObj;
		Vector2D velVectorObj= new Vector2D();
		Vector2D preVelVectorObj = new Vector2D();
		
		//ROTATIONAL DAMPING DECELERATION
		float accelleration = -0.1f/0.4f; //F = M*A  =====>  A = F/M
		Vector2D dampingAcc = new Vector2D(0.0f, accelleration);
		Vector2D dampingMAcc =Vector2DMaths.multipleVector(dampingAcc, timeStep);//DECELERATION FOR THE TIME STEP //V = U + (AT)<==this will calculate here 
		//ROTATING DECELERATION VECTOR TO NEW DIRECTION WHERE THE OBJECT BALL BEGUN TO MOVE TOWARDS 
		Vector2D dampingMAccAfter =Vector2DMaths.rotateVector(dampingMAcc, 90 - angleHit );
		boolean struck = false;// SAVES WHETHER CUE BALL HAS STRUCK THE OBJECT BALL
		
		//PRINTING ALL THE VECTOR COMPONENTS OF CUE BALL TO THE CONSOLE
		System.out.println("=======================================================================================");
    	System.out.printf("|| %14s ||%14s ||%14s ||%14s ||%14s ||\n","Y-Pos Vector","X-Pos Vector","Y-Vel Vector","X-Vel Vector","Eplased Time(s)");
    	System.out.println("=======================================================================================");
    	System.out.println("=======================================================================================");
    	System.out.println("---------------------------------- Cue Ball Motion ------------------------------------");
    	System.out.println("=======================================================================================");
    	while( true ){
    		if(!struck){
    			
    			System.out.printf("|| %14.4f ||%14.4f ||%14.4f ||%14.4f ||%14.4f ||\n",posVectorCue.y,posVectorCue.x,velVectorCue.y,velVectorCue.x,time);
	    		time+=timeStep;
	    		preVelVectorCue = new Vector2D(velVectorCue.x, velVectorCue.y);
		    	velVectorCue = Vector2DMaths.addVectors(preVelVectorCue, rotDamping(preVelVectorObj,dampingMAcc));// V = (U) + (AT)
		    	prePosVectorCue = new Vector2D(posVectorCue.x, posVectorCue.y);
				Vector2D posDifference = Vector2DMaths.multipleVector(velVectorCue, timeStep);//CHANGE OF THE PLACE FOR THE TIME STEP ==> POSITION_DIFFERENCE
		    	posVectorCue = Vector2DMaths.addVectors(prePosVectorCue, posDifference);// POSITION_NEW = POSITION_OLD + POSITION_DIFFERENCE
		    	Vector2D distanceVec = Vector2DMaths.subVectors(posVectorObj, posVectorCue);// DISTANCE VECTOR BETWEEN CUE BALL AND THE OBJECT BALL
		    	float distanceBetween = Vector2DMaths.magnitudeVector(distanceVec);// GETTING THE MAGNITUTE OF THE ABOVE VECTOR
		    	//IF WHEN CUE BALL HITS(HAS TOUCHED) THE DISTANCE BETWEEN TWO CENTERS OF THE BALLS == (BALL_RADIUS * 2)
		    	if(distanceBetween<=0.052f){//CHECK WHETHERCUE BALL HAS STRUCK THE OBJECT BALL
		    		struck=true;
		    		float magVelBeforeStruck = Vector2DMaths.magnitudeVector(velVectorCue);// VELOCITY A MOMENT BEFORE COLLISION
		    		float magVelAfterStruckObj = magVelBeforeStruck * (float)Math.sin(angleHitRad);// INITIAL VELOCITY OF THE OBJECT BALL AFTER THE COLLISION
		    		velVectorObj=Vector2DMaths.velocityVector(magVelAfterStruckObj, 180 - angleHit);
		    		//PRINTING ALL THE VECTOR COMPONENTS OF OBJECT BALL TO THE CONSOLE
		    		System.out.println("===========================================================================================");
		    		System.out.println("Object ball initial velocity after strike: "+magVelAfterStruckObj+" ms-1");
		    		System.out.println("=======================================================================================");
		        	System.out.println("-------------------------------- Object Ball Motion -----------------------------------");
		        	System.out.println("=======================================================================================");
		    	}	    	
	    	}else{
	    		System.out.printf("|| %14.4f ||%14.4f ||%14.4f ||%14.4f ||%14.4f ||\n",posVectorObj.y,posVectorObj.x,velVectorObj.y,velVectorObj.x,time);
	    		time+=timeStep;
	    		preVelVectorObj = new Vector2D(velVectorObj.x, velVectorObj.y);
		    	velVectorObj = Vector2DMaths.addVectors(preVelVectorObj, rotDamping(preVelVectorObj,dampingMAccAfter));// V = (U) + (AT)
		    	prePosVectorObj = new Vector2D(posVectorObj.x, posVectorObj.y);
				Vector2D posDifference = Vector2DMaths.multipleVector(velVectorObj, timeStep);//CHANGE OF THE PLACE FOR THE TIME STEP ==> POSITION_DIFFERENCE
		    	posVectorObj = Vector2DMaths.addVectors(prePosVectorObj, posDifference);// POSITION_NEW = POSITION_OLD + POSITION_DIFFERENCE
		    	//SET VELOCITY TO ZERO IF ITS IS MOVING IN AN VERY SMALL VELOCITY
		    	if(Math.abs(velVectorObj.x)<0.0001){
	    			velVectorObj.x=0;
	    		}
	    		if(Math.abs(velVectorObj.y)<0.0001){
	    			velVectorObj.y=0;
	    		}
	    		
	    		//STOP THE CACULATION-DISPLAY LOOP IF THE BALL MOVES VERY SLOWLY(== NO MOTION) WITH THE TIME
		    	if(Math.abs(posVectorObj.x - prePosVectorObj.x)<0.001 && Math.abs(posVectorObj.y - prePosVectorObj.y)<0.001){
		    		break;
		    	}
		    	
	    	}
    		
    	}
    	//SHOWING A SHORT SUMMERY OF THE MOTION
    	System.out.println("===================================================================================================================");
		System.out.println("------------------------------------------------- Summery ---------------------------------------------------------");
		System.out.println("===================================================================================================================");
		System.out.println("Distance Traveled Object Ball : "+Vector2DMaths.magnitudeVector(posVectorObj)+" m");
		System.out.println("===================================================================================================================");

	}
	
	//THIS METHOD MAKE SURE THAT ALWAYS ROTATIONAL DAMPING WILL WORK AGAINST(OPPOSITE SIDE) THE VELOCITY
	public static Vector2D rotDamping(Vector2D preVelVectorObj,Vector2D rotDampVector){
		Vector2D changedRotDampVector = new Vector2D(rotDampVector.x,rotDampVector.y);
		//SET ROTATION DAMPING TO ZERO IF THE BALL DOES NOT MOVE X , Y OR BOTH DIRECTIONS
		if(preVelVectorObj.x==0){
			changedRotDampVector.x=0;
		}else if(preVelVectorObj.y==0){
			changedRotDampVector.y=0;
		}
		
		//CHECKING FOR THE VELOCITY DIRECTION AND THEN MAKINNG ROTATIONAL DAMPING AGAINST IT
		if(preVelVectorObj.x<0 && rotDampVector.x<0){
			changedRotDampVector.x = -rotDampVector.x;
		}else if(preVelVectorObj.x>0 && rotDampVector.x>0){
			changedRotDampVector.x = -rotDampVector.x;
		}
		if(preVelVectorObj.y<0 && rotDampVector.y<0){
			changedRotDampVector.y = -rotDampVector.y;
		}else if(preVelVectorObj.y>0 && rotDampVector.y>0){
			changedRotDampVector.y = -rotDampVector.y;
		}
		return changedRotDampVector;
		
	}
	
	//CONFIRMATION TO MENU
	public static void confirm(){
		Scanner scn = new Scanner(System.in);
		System.out.println("Press Y to go to main menu or 0 to exit program..");
		String in = scn.nextLine();
		if(in.equalsIgnoreCase("Y")){
			testMenu();
		}else{
			System.exit(0);//EXITING PROGRAM
		}
	}
	

}


