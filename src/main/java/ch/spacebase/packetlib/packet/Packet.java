package ch.spacebase.packetlib.packet;

import java.io.IOException;

import ch.spacebase.packetlib.io.NetInput;
import ch.spacebase.packetlib.io.NetOutput;

/**
 * A network packet.
 */
public interface Packet {
	
	/**
	 * Reads the packet from the given input buffer.
	 * @param in The input source to read from.
	 */
	public void read(NetInput in) throws IOException;

	/**
	 * Writes the packet to the given output buffer.
	 * @param out The output destination to write to.
	 */
	public void write(NetOutput out) throws IOException;

	/**
	 * Gets whether the packet has handling and writing priority.
	 * If the result is true, the thread will wait for the packet to finish writing
	 * when writing and the packet will be handled immediately after reading it.
	 * @return Whether the packet has priority.
	 */
	public boolean isPriority();
	
}
