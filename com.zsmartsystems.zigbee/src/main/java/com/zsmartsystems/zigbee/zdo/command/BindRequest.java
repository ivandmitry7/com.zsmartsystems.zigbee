package com.zsmartsystems.zigbee.zdo.command;

import com.zsmartsystems.zigbee.zdo.ZdoRequest;

/**
 * BindRequest.
 *
 * @author Tommi S.E. Laukkanen
 */
public class BindRequest extends ZdoRequest {

    /**
     * Bind source address.
     */
    private long bindSourceAddress;
    /**
     * Bind source end point.
     */
    private int bindSourceEndpoint;
    /**
     * Bind cluster.
     */
    private int bindCluster;
    /**
     * Bind destination addressing mode.
     */
    private int bindDestinationAddressingMode;
    /**
     * Bind destination address.
     */
    private long bindDestinationAddress;
    /**
     * Bind destination endpoint.
     */
    private int bindDestinationEndpoint;

    public BindRequest() {
    }

    public BindRequest(int destinationAddress, long bindSourceAddress, int bindSourceEndpoint, int bindCluster,
            int bindDestinationAddressingMode, long bindDestinationAddress, int bindDestinationEndpoint) {
        this.destinationAddress = destinationAddress;
        this.bindSourceAddress = bindSourceAddress;
        this.bindSourceEndpoint = bindSourceEndpoint;
        this.bindCluster = bindCluster;
        this.bindDestinationAddressingMode = bindDestinationAddressingMode;
        this.bindDestinationAddress = bindDestinationAddress;
        this.bindDestinationEndpoint = bindDestinationEndpoint;
    }

    public long getBindSourceAddress() {
        return bindSourceAddress;
    }

    public void setBindSourceAddress(long bindSourceAddress) {
        this.bindSourceAddress = bindSourceAddress;
    }

    public int getBindSourceEndpoint() {
        return bindSourceEndpoint;
    }

    public void setBindSourceEndpoint(int bindSourceEndpoint) {
        this.bindSourceEndpoint = bindSourceEndpoint;
    }

    public int getBindCluster() {
        return bindCluster;
    }

    public void setBindCluster(int bindCluster) {
        this.bindCluster = bindCluster;
    }

    public int getBindDestinationAddressingMode() {
        return bindDestinationAddressingMode;
    }

    public void setBindDestinationAddressingMode(int bindDestinationAddressingMode) {
        this.bindDestinationAddressingMode = bindDestinationAddressingMode;
    }

    public long getBindDestinationAddress() {
        return bindDestinationAddress;
    }

    public void setBindDestinationAddress(long bindDestinationAddress) {
        this.bindDestinationAddress = bindDestinationAddress;
    }

    public int getBindDestinationEndpoint() {
        return bindDestinationEndpoint;
    }

    public void setBindDestinationEndpoint(int bindDestinationEndpoint) {
        this.bindDestinationEndpoint = bindDestinationEndpoint;
    }

    @Override
    public String toString() {
        return "Bind Request: destinationAddress=" + destinationAddress + ", bindSourceAddress=" + bindSourceAddress
                + ", bindSourceEndpoint=" + bindSourceEndpoint + ", bindCluster=" + bindCluster
                + ", bindDestinationAddressingMode=" + bindDestinationAddressingMode + ", bindDestinationAddress="
                + bindDestinationAddress + ", bindDestinationEndpoint=" + bindDestinationEndpoint;
    }
}