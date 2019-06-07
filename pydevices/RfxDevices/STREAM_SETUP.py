
from MDSplus import *


class STREAM_SETUP(Device):
    parts=[{'path':':COMMENT', 'type':'text'},
        {'path':':NID1', 'type':'numeric'},
        {'path':':NAME1', 'type':'text'},
        {'path':':NID2', 'type':'numeric'},
        {'path':':NAME2', 'type':'text'},
        {'path':':NID3', 'type':'numeric'},
        {'path':':NAME3', 'type':'text'},
        {'path':':NID4', 'type':'numeric'},
        {'path':':NAME4', 'type':'text'},
        {'path':':NID5', 'type':'numeric'},
        {'path':':NAME5', 'type':'text'},
        {'path':':NID6', 'type':'numeric'},
        {'path':':NAME6', 'type':'text'},
        {'path':':NID7', 'type':'numeric'},
        {'path':':NAME7', 'type':'text'},
        {'path':':NID8', 'type':'numeric'},
        {'path':':NAME8', 'type':'text'},
        {'path':':NID9', 'type':'numeric'},
        {'path':':NAME9', 'type':'text'},
        {'path':':NID10', 'type':'numeric'},
        {'path':':NAME10', 'type':'text'},
        {'path':':NID11', 'type':'numeric'},
        {'path':':NAME11', 'type':'text'},
        {'path':':NID12', 'type':'numeric'},
        {'path':':NAME12', 'type':'text'},
        {'path':':NID13', 'type':'numeric'},
        {'path':':NAME13', 'type':'text'},
        {'path':':NID14', 'type':'numeric'},
        {'path':':NAME14', 'type':'text'},
        {'path':':NID15', 'type':'numeric'},
        {'path':':NAME15', 'type':'text'},
        {'path':':NID16', 'type':'numeric'},
        {'path':':NAME16', 'type':'text'},
        {'path':':INIT_ACTION','type':'action',
         'valueExpr':"Action(Dispatch('CPCI_SERVER','PULSE_PREPARATION',50,None),Method(None,'init',head))",
         'options':('no_write_shot',)}]

    def init(self):
      print('================= STREAM_SETUP Init ===============')
      for chan in range(0, 16):
        try:
          name = getattr(self, 'name%d'%(chan+1)).getString()
          nid = getattr(self, 'nid%d'%(chan+1)).getData()
          if isinstance(nid, TreeNode):
            print('TREE NODE')
            nid.setExtendedAttribute('STREAM_NAME', name)
            print(name)
            print(nid)
        except:
            pass
      return 1

