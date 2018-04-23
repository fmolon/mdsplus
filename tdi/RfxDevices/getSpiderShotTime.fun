public fun getSpiderShotTime(optional in _shot)
{

/*
TAI, Temps Atomique International, is the international atomic time scale based on a continuous counting of the SI second. TAI is currently ahead of UTC by 37 seconds. TAI is always ahead of GPS by 19 seconds.

POSIX_TIME_AT_EPICS_EPOCH 631152000u

https://www.ietf.org/timezones/data/leap-seconds.list

lapse time 3754944000 37

*/

   if(present(_shot))
       treeopen("spider", _shot);

   _tai_s  = data(build_path("\\SPIDER::TOP.TIMING:ABS_TMSP.PULSE_TIME:TAI_S"));
   _tai_ns = data(build_path("\\SPIDER::TOP.TIMING:ABS_TMSP.PULSE_TIME:TAI_NS"));

   if(present(_shot))
       treeclose();

/*
   _epicsTime = ( _tai_s * 1000 - 631152000000Q ) * 1000000;
*/
   _epicsTime = quadword ( ( _tai_ns  / 1000000Q - 37Q * 1000Q - 631152000000Q ) * 1000000 );

   return( _epicsTime  );
} 

