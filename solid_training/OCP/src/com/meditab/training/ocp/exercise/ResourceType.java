package com.meditab.training.ocp.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 11, 2011
 * Time: 1:17:04 PM
 * To change this template use File | Settings | File Templates.
 */
public enum ResourceType
{
    TIME_SLOT,
    SPACE_SLOT,
    MEMORY_SLOT
}



interface Resources
{
	public int allocate(ResourceType resourceType);
	public void free(ResourceType resourceType, int resourceId);
	private void markSpaceSlotFree(int resourceId);
	private void markTimeSlotFree(int resourceId);
	private void markMemory_SlotFree(int resourceId);
	private void markSpaceSlotBusy(int resourceId);
	private int findFreeSpaceSlot();
	private void markTimeSlotBusy(int resourceId);
	private void markMemorySlotBusy(int resourceId);
	private int findFreeTimeSlot();
	
}