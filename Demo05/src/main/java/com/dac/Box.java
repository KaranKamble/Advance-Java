package com.dac;

public interface Box {
	
	void setLength( int length );
	void setBreadth( int breadth );
	void setHeight ( int height );
	
	int getLength();
	int getBreadth();
	int getHeight();
	
	int calculateVolume();
	
}
