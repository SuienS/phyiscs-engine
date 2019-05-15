package Physics;

public class Vector2DMaths { 
	
	/**Vector addition*/
	public static Vector2D addVectors(Vector2D vec1, Vector2D vec2) {
		Vector2D vecResult2D = new Vector2D();
		vecResult2D.x = vec1.x + vec2.x;
		vecResult2D.y = vec1.y + vec2.y;
		return vecResult2D;
	}
	
	/**Vector SUBSTRACTION*/
	public static Vector2D subVectors(Vector2D vec1, Vector2D vec2) {
		Vector2D vecResult2D = new Vector2D();
		vecResult2D.x = vec1.x - vec2.x;
		vecResult2D.y = vec1.y - vec2.y;
		return vecResult2D;
	}
	
	/**Vector DOT PR0DUCT*/
	public static float dotProdVectors(Vector2D vec1, Vector2D vec2) {
		float dotProduct = 0.0f;
		float xProd = vec1.x * vec2.x;
		float yProd = vec1.y * vec2.y;
		dotProduct=xProd+yProd;
		return dotProduct;
	}
	
	/**Vector UNIT NORMAL*/
	public static Vector2D unitNormVector(Vector2D vec) {
		Vector2D vecResult2D = new Vector2D();
		float mag = magnitudeVector(vec);
		vecResult2D.x = vec.x/mag;//DIVIDING BY THE MAGNITUDE
		vecResult2D.y = vec.y/mag;
		return vecResult2D;
	}
	
	/**Vector ROTATION*/
	public static Vector2D rotateVector(Vector2D vec,double angle) {
		Vector2D vecResult2D = new Vector2D();
		double radAngle = Math.toRadians(angle);
			/* EQUATION ===> x2=cosβx1−sinβy1
			 * 				 y2=sinβx1+cosβy1  */
		vecResult2D.x = (float) ( Math.cos(radAngle) * vec.x - Math.sin(radAngle) * vec.y );
		vecResult2D.y = (float) ( Math.sin(radAngle) * vec.x + Math.cos(radAngle) * vec.y );
		return vecResult2D;
	}
	
	/**Vector MAGNITUTE*/
	public static float magnitudeVector(Vector2D vec) {
		float mag = (float) Math.sqrt(dotProdVectors(vec, vec)); //EQUATION ===> A.A = |A|*|A|
		return mag;
	}
	
	/**Vector SCALER MULTIPLE*/
	public static Vector2D multipleVector(Vector2D vec,float scValue) {
		Vector2D vecResult2D = new Vector2D();
		vecResult2D.x = vec.x*scValue;
		vecResult2D.y = vec.y*scValue;
		return vecResult2D;
	}
	
	
	/**Vector VELOCITY*/
	public static Vector2D velocityVector(float vel,double angle) {
		Vector2D vecResult2D = new Vector2D();
		double radAngle = Math.toRadians(angle);
		vecResult2D.x = (float) ( Math.cos(radAngle) * vel );
		vecResult2D.y = (float) ( Math.sin(radAngle) * vel );
		return vecResult2D;
	}
	
	
	
	
}