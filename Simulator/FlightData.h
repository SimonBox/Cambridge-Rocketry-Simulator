#ifndef FlightData_H
#define FlightData_H

//Headers*********************************************
#include<vector>
#include<string>
#include<sstream>
#include<time.h>
#include"vectorops.h"
#include"vmaths.h"
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/xml_parser.hpp>
#include <boost/foreach.hpp>

using namespace std;
//****************************************************

class FlightData{
public:
	//Class members
	vector<double> time;
	vector<vector3> X;

	//Constructor
	FlightData(){};

	//Class Functions
	virtual boost::property_tree::ptree BuildPropertyTree(int)=0;
	void ApogeeLanding(vector<double> *,vector<double> *,double *);
	void TreeIfy(boost::property_tree::ptree *,vector<double>,string);
	void TreeIfy(boost::property_tree::ptree *,vector<vector3>,string);
};



class FlightDataShort:public FlightData{
public:
	FlightDataShort(){};
	FlightDataShort operator + (FlightDataShort);
	boost::property_tree::ptree BuildPropertyTree(int);
};

class FlightDataLong:public FlightData{
public:
	vector<double> 
		alpha,
		Thrust,
		Mass,
		CofM,
		aDensity,
		aTemp;
	vector<vector3>
		Raxis,
		Xdot,
		Thetadot,
		Xddot,
		Thetaddot,
		Force,
		Torque,
		Wind;
	vector<matrix3x3>
		Inertia;
	FlightDataLong(){};
	FlightDataLong operator + (FlightDataLong);
	boost::property_tree::ptree BuildPropertyTree(int);
	void SpeedAndG(double *,double *);
};

class OutputData{
public:
	boost::property_tree::ptree PropTree;

	//Constructors
	OutputData(){};
	
	//Functions
	void InitializePropertyTree(string);
	void FillPropertyTree(FlightData *,int);
	void FillPropertyTree(vector<FlightData *>,int);
	void WriteToXML(string);
};


#endif