# -*- coding: iso-8859-1 -*-
from MDSplus import *
import time
import MARTE_GENERIC

class MARTE_EDA1(MARTE_GENERIC.MARTE_GENERIC):
    print 'MARTe EDA1'
    parNames = ['ccType', 'psConfiguration','ccKp','ccTEnd','tokccTStart','tokccVMax','rfpccIpStar','rfpccDeltaIpStar','rfpccDeltaTRampDown',
    	'rfpccPOhmMax','rfpccTauz','rfpccTaup','rfpccDeltaTBumpless','aaGain','invAAGain','rfpcc2VrtStar','rfpcc2PCATMaxOnTime','bvGain',
	'maxPVATCurr','decouplerGain','compResGain','Kp','Ki','tStartEquilIntegralAction','minIpCurr','equilNonlinearFactorSaturation',
	'fsMMFRT','fsBvRT','ffwdOn','fdbkOn','voltageControl','equiFlux','strainAlarmLatchTime']
    parValues = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,Data.compile('zero(8, 0.)'),Data.compile('zero(8, 0.)'),0,0,0,0,0] 
    parts = []
    for i in range(len(MARTE_GENERIC.MARTE_GENERIC.parts)):
      parts.append(MARTE_GENERIC.MARTE_GENERIC.parts[i])
    parts.append({'path':'.PARAMS', 'type':'structure'})
    parts.append({'path':'.PARAMS:NUM_ACTIVE', 'type':'numeric', 'value':len(parNames)})
    for i in range(len(parNames)):
      parts.append({'path':'.PARAMS:PAR_%03d'%(i+1), 'type':'structure'})
      parts.append({'path':'.PARAMS:PAR_%03d:DESCRIPTION'%(i+1), 'type':'text'})
      parts.append({'path':'.PARAMS:PAR_%03d:NAME'%(i+1), 'type':'text', 'value':parNames[i]})
      parts.append({'path':'.PARAMS:PAR_%03d:TYPE'%(i+1), 'type':'text'})
      parts.append({'path':'.PARAMS:PAR_%03d:DIMS'%(i+1), 'type':'numeric'})
      parts.append({'path':'.PARAMS:PAR_%03d:DATA'%(i+1), 'type':'numeric','value':parValues[i]})

    for i in range(len(parNames), 256):
      parts.append({'path':'.PARAMS:PAR_%03d'%(i+1), 'type':'structure'})
      parts.append({'path':'.PARAMS:PAR_%03d:DESCRIPTION'%(i+1), 'type':'text'})
      parts.append({'path':'.PARAMS:PAR_%03d:NAME'%(i+1), 'type':'text'})
      parts.append({'path':'.PARAMS:PAR_%03d:TYPE'%(i+1), 'type':'text'})
      parts.append({'path':'.PARAMS:PAR_%03d:DIMS'%(i+1), 'type':'numeric'})
      parts.append({'path':'.PARAMS:PAR_%03d:DATA'%(i+1), 'type':'numeric'})

    print 'FATTI PARAMS'

    parts.append({'path':'.WAVE_PARAMS', 'type':'structure'})
    parts.append({'path':'.WAVE_PARAMS:NUM_ACTIVE', 'type':'numeric', 'value':29})
    waveParNames = ['bvAddRef','deltaIpRef','ipRef','normIpRef','iFSAddRef_1','iFSAddRef_2','iFSAddRef_3','iFSAddRef_4','iFSAddRef_5',
        'iFSAddRef_6','iFSAddRef_7','iFSAddRef_8','deltaIFSAddRef_1','deltaIFSAddRef_2','deltaIFSAddRef_3','deltaIFSAddRef_4',
	'deltaIFSAddRef_5','deltaIFSAddRef_6','deltaIFSAddRef_7','deltaIFSAddRef_8','deltaHRef','pmatRef','pcatRef','tfatRef',
	'fRef','btwRef','qRef']  
    for i in range(len(waveParNames)):
      print 'WAVE', i
      parts.append({'path':'.WAVE_PARAMS:WAVE_%03d'%(i+1), 'type':'structure'})
      parts.append({'path':'.WAVE_PARAMS:WAVE_%03d:DESCRIPTION'%(i+1), 'type':'text'})
      parts.append({'path':'.WAVE_PARAMS:WAVE_%03d:NAME'%(i+1), 'type':'text', 'value':waveParNames[i]})
      parts.append({'path':'.WAVE_PARAMS:WAVE_%03d:X'%(i+1), 'type':'numeric', 'value':Data.compile('[0.,1.]')})
      parts.append({'path':'.WAVE_PARAMS:WAVE_%03d:Y'%(i+1), 'type':'numeric', 'value':Data.compile('[0.,0.]')})
    
    for i in range(len(waveParNames), 64):
      parts.append({'path':'.WAVE_PARAMS:WAVE_%03d'%(i+1), 'type':'structure'})
      parts.append({'path':'.WAVE_PARAMS:WAVE_%03d:DESCRIPTION'%(i+1), 'type':'text'})
      parts.append({'path':'.WAVE_PARAMS:WAVE_%03d:NAME'%(i+1), 'type':'text'})
      parts.append({'path':'.WAVE_PARAMS:WAVE_%03d:X'%(i+1), 'type':'numeric'})
      parts.append({'path':'.WAVE_PARAMS:WAVE_%03d:Y'%(i+1), 'type':'numeric'})
    print 'PARTS FATTE!!!'

