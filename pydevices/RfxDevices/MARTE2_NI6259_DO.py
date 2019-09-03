#
# Copyright (c) 2017, Massachusetts Institute of Technology All rights reserved.
#
# Redistribution and use in source and binary forms, with or without
# modification, are permitted provided that the following conditions are met:
#
# Redistributions of source code must retain the above copyright notice, this
# list of conditions and the following disclaimer.
#
# Redistributions in binary form must reproduce the above copyright notice, this
# list of conditions and the following disclaimer in the documentation and/or
# other materials provided with the distribution.
#
# THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
# AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
# IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
# DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
# FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
# DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
# SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
# CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
# OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
# OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
#

from MDSplus import *
from MARTE2_COMPONENT import *
class MARTE2_NI6259_DO(MARTE2_COMPONENT):
    MARTE2_COMPONENT.inputs = [
      {'name': 'DIO_0', 'type': 'uint32', 'dimensions': 0, 'parameters':[{'name':'PortId', 'type': 'int', 'value':0},
									   {'name':'Mask', 'type':'int', 'value': 1},
									   {'name':'Trigger', 'type':'int', 'value':1}]},
      {'name': 'DIO_1', 'type': 'uint32', 'dimensions': 0, 'parameters':[{'name':'PortId', 'type': 'int', 'value':1},
									   {'name':'Mask', 'type':'int', 'value': 1}]},
      {'name': 'DIO_2', 'type': 'uint32', 'dimensions': 0, 'parameters':[{'name':'PortId', 'type': 'int', 'value':2},
									   {'name':'Mask', 'type':'int', 'value': 1}]}]
    MARTE2_COMPONENT.parameters = [{'name': 'DeviceName', 'type': 'string', 'value':'/dev/pxi6259'},
				   {'name': 'BoardId', 'type': 'int32', 'value':0}]
    parts = []
    MARTE2_COMPONENT.buildGam(parts, 'NI6259::NI6259DIO', MARTE2_COMPONENT.MODE_OUTPUT)

#    def prepareMarteInfo(self):



