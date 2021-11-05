private const val TAG = "MainActivity"

public static Int d(String tag, String msg)

override fun onCreate(savedInstanceState: Bundle?) {
	super.onCreate(savedInstanceState)
	Log.d(TAG, "onCreate(Bundle?) called")
	setContentView(R.layout.activity_main)
}

override fun onStart() {
	super.onStart()
	Log.d(TAG, "onStart() called")
}
 
override fun onResume() {
	super.onResume()
	Log.d(TAG, "onResume() called")
}
 
override fun onPause() {
	super.onPause()
	Log.d(TAG, "onPause() called")
}
 
override fun onStop() {
	super.onStop()
	Log.d(TAG, "onStop() called")
}
 
override fun onDestroy() {
	super.onDestroy()
	Log.d(TAG, "onDestroy() called")
}
