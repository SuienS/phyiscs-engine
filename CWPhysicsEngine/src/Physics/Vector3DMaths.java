package Physics;

public class Vector3DMaths {

	/**Vector addition*/
	public static Vector3D addVectors(Vector3D vec1, Vector3D vec2) {
		Vector3D vecResult3D = new Vector3D();
		vecResult3D.x = vec1.x + vec2.x;
		vecResult3D.y = vec1.y + vec2.y;
		vecResult3D.z = vec1.z + vec2.z;
		return vecResult3D;
	}

	/**Vector SUBSTRACTION*/
	public static Vector3D subVectors(Vector3D vec1, Vector3D vec2) {
		Vector3D vecResult3D = new Vector3D();
		vecResult3D.x = vec1.x - vec2.x;
		vecResult3D.y = vec1.y - vec2.y;
		vecResult3D.z = vec1.z - vec2.z;
		return vecResult3D;
	}
	
	/**Vector DOT PR0DUCT*/
	public static float dotProdVectors(Vector3D vec1, Vector3D vec2) {
		float dotProduct = 0.0f;
		float xProd = vec1.x * vec2.x;
		float yProd = vec1.y * vec2.y;
		float zProd = vec1.z * vec2.z;
		dotProduct=xProd+yProd+zProd;
		return dotProduct;
	}
	
	/**Vector UNIT NORMAL*/
	public static Vector3D unitNormVector(Vector3D vec) {
		Vector3D vecResult3D = new Vector3D();
		float mag = magnitudeVector(vec);
		vecResult3D.x = vec.x/mag;
		vecResult3D.y = vec.y/mag;
		vecResult3D.z = vec.z/mag;
		return vecResult3D;
	}
	
	/**Vector MAGNITUTE*/
	public static float magnitudeVector(Vector3D vec) {
		float mag = (float) Math.sqrt(dotProdVectors(vec, vec));
		return mag;
	}

	
	/**Vector SCALER MULTIPLE*/
	public static Vector3D multipleVector(Vector3D vec,float scValue) {
		Vector3D vecResult3D = new Vector3D();
		vecResult3D.x = vec.x*scValue;
		vecResult3D.y = vec.y*scValue;
		vecResult3D.z = vec.z*scValue;
		return vecResult3D;
	}
	
}
