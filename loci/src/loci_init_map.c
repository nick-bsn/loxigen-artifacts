/* Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University */
/* Copyright (c) 2011, 2012 Open Networking Foundation */
/* Copyright (c) 2012, 2013 Big Switch Networks, Inc. */
/* See the file LICENSE.loci which should have been included in the source distribution */
#include <loci/loci.h>
#include <loci/of_object.h>
#include "loci_log.h"
#include "loci_int.h"

/**
 * Map from object ID to type coerce function
 */
const of_object_init_f of_object_init_map[] = {
    (of_object_init_f)NULL,
    (of_object_init_f)of_aggregate_stats_reply_init,
    (of_object_init_f)of_aggregate_stats_request_init,
    (of_object_init_f)of_async_config_failed_error_msg_init,
    (of_object_init_f)of_async_get_reply_init,
    (of_object_init_f)of_async_get_request_init,
    (of_object_init_f)of_async_set_init,
    (of_object_init_f)of_bad_action_error_msg_init,
    (of_object_init_f)of_bad_instruction_error_msg_init,
    (of_object_init_f)of_bad_match_error_msg_init,
    (of_object_init_f)of_bad_property_error_msg_init,
    (of_object_init_f)of_bad_request_error_msg_init,
    (of_object_init_f)of_barrier_reply_init,
    (of_object_init_f)of_barrier_request_init,
    (of_object_init_f)of_bsn_arp_idle_init,
    (of_object_init_f)of_bsn_base_error_init,
    (of_object_init_f)of_bsn_bw_clear_data_reply_init,
    (of_object_init_f)of_bsn_bw_clear_data_request_init,
    (of_object_init_f)of_bsn_bw_enable_get_reply_init,
    (of_object_init_f)of_bsn_bw_enable_get_request_init,
    (of_object_init_f)of_bsn_bw_enable_set_reply_init,
    (of_object_init_f)of_bsn_bw_enable_set_request_init,
    (of_object_init_f)of_bsn_controller_connections_reply_init,
    (of_object_init_f)of_bsn_controller_connections_request_init,
    (of_object_init_f)of_bsn_debug_counter_desc_stats_reply_init,
    (of_object_init_f)of_bsn_debug_counter_desc_stats_request_init,
    (of_object_init_f)of_bsn_debug_counter_stats_reply_init,
    (of_object_init_f)of_bsn_debug_counter_stats_request_init,
    (of_object_init_f)of_bsn_error_init,
    (of_object_init_f)of_bsn_flow_checksum_bucket_stats_reply_init,
    (of_object_init_f)of_bsn_flow_checksum_bucket_stats_request_init,
    (of_object_init_f)of_bsn_flow_idle_init,
    (of_object_init_f)of_bsn_flow_idle_enable_get_reply_init,
    (of_object_init_f)of_bsn_flow_idle_enable_get_request_init,
    (of_object_init_f)of_bsn_flow_idle_enable_set_reply_init,
    (of_object_init_f)of_bsn_flow_idle_enable_set_request_init,
    (of_object_init_f)of_bsn_generic_async_init,
    (of_object_init_f)of_bsn_generic_command_init,
    (of_object_init_f)of_bsn_generic_stats_reply_init,
    (of_object_init_f)of_bsn_generic_stats_request_init,
    (of_object_init_f)of_bsn_gentable_bucket_stats_reply_init,
    (of_object_init_f)of_bsn_gentable_bucket_stats_request_init,
    (of_object_init_f)of_bsn_gentable_clear_reply_init,
    (of_object_init_f)of_bsn_gentable_clear_request_init,
    (of_object_init_f)of_bsn_gentable_desc_stats_reply_init,
    (of_object_init_f)of_bsn_gentable_desc_stats_request_init,
    (of_object_init_f)of_bsn_gentable_entry_add_init,
    (of_object_init_f)of_bsn_gentable_entry_delete_init,
    (of_object_init_f)of_bsn_gentable_entry_desc_stats_reply_init,
    (of_object_init_f)of_bsn_gentable_entry_desc_stats_request_init,
    (of_object_init_f)of_bsn_gentable_entry_stats_reply_init,
    (of_object_init_f)of_bsn_gentable_entry_stats_request_init,
    (of_object_init_f)of_bsn_gentable_set_buckets_size_init,
    (of_object_init_f)of_bsn_gentable_stats_reply_init,
    (of_object_init_f)of_bsn_gentable_stats_request_init,
    (of_object_init_f)of_bsn_get_interfaces_reply_init,
    (of_object_init_f)of_bsn_get_interfaces_request_init,
    (of_object_init_f)of_bsn_get_ip_mask_reply_init,
    (of_object_init_f)of_bsn_get_ip_mask_request_init,
    (of_object_init_f)of_bsn_get_l2_table_reply_init,
    (of_object_init_f)of_bsn_get_l2_table_request_init,
    (of_object_init_f)of_bsn_get_mirroring_reply_init,
    (of_object_init_f)of_bsn_get_mirroring_request_init,
    (of_object_init_f)of_bsn_get_switch_pipeline_reply_init,
    (of_object_init_f)of_bsn_get_switch_pipeline_request_init,
    (of_object_init_f)of_bsn_header_init,
    (of_object_init_f)of_bsn_hybrid_get_reply_init,
    (of_object_init_f)of_bsn_hybrid_get_request_init,
    (of_object_init_f)of_bsn_image_desc_stats_reply_init,
    (of_object_init_f)of_bsn_image_desc_stats_request_init,
    (of_object_init_f)of_bsn_lacp_convergence_notif_init,
    (of_object_init_f)of_bsn_lacp_stats_reply_init,
    (of_object_init_f)of_bsn_lacp_stats_request_init,
    (of_object_init_f)of_bsn_log_init,
    (of_object_init_f)of_bsn_lua_command_reply_init,
    (of_object_init_f)of_bsn_lua_command_request_init,
    (of_object_init_f)of_bsn_lua_notification_init,
    (of_object_init_f)of_bsn_lua_upload_init,
    (of_object_init_f)of_bsn_pdu_rx_reply_init,
    (of_object_init_f)of_bsn_pdu_rx_request_init,
    (of_object_init_f)of_bsn_pdu_rx_timeout_init,
    (of_object_init_f)of_bsn_pdu_tx_reply_init,
    (of_object_init_f)of_bsn_pdu_tx_request_init,
    (of_object_init_f)of_bsn_port_counter_stats_reply_init,
    (of_object_init_f)of_bsn_port_counter_stats_request_init,
    (of_object_init_f)of_bsn_role_status_init,
    (of_object_init_f)of_bsn_set_aux_cxns_reply_init,
    (of_object_init_f)of_bsn_set_aux_cxns_request_init,
    (of_object_init_f)of_bsn_set_ip_mask_init,
    (of_object_init_f)of_bsn_set_l2_table_reply_init,
    (of_object_init_f)of_bsn_set_l2_table_request_init,
    (of_object_init_f)of_bsn_set_lacp_reply_init,
    (of_object_init_f)of_bsn_set_lacp_request_init,
    (of_object_init_f)of_bsn_set_mirroring_init,
    (of_object_init_f)of_bsn_set_pktin_suppression_reply_init,
    (of_object_init_f)of_bsn_set_pktin_suppression_request_init,
    (of_object_init_f)of_bsn_set_switch_pipeline_reply_init,
    (of_object_init_f)of_bsn_set_switch_pipeline_request_init,
    (of_object_init_f)of_bsn_shell_command_init,
    (of_object_init_f)of_bsn_shell_output_init,
    (of_object_init_f)of_bsn_shell_status_init,
    (of_object_init_f)of_bsn_stats_reply_init,
    (of_object_init_f)of_bsn_stats_request_init,
    (of_object_init_f)of_bsn_switch_pipeline_stats_reply_init,
    (of_object_init_f)of_bsn_switch_pipeline_stats_request_init,
    (of_object_init_f)of_bsn_table_checksum_stats_reply_init,
    (of_object_init_f)of_bsn_table_checksum_stats_request_init,
    (of_object_init_f)of_bsn_table_set_buckets_size_init,
    (of_object_init_f)of_bsn_takeover_init,
    (of_object_init_f)of_bsn_time_reply_init,
    (of_object_init_f)of_bsn_time_request_init,
    (of_object_init_f)of_bsn_virtual_port_create_reply_init,
    (of_object_init_f)of_bsn_virtual_port_create_request_init,
    (of_object_init_f)of_bsn_virtual_port_remove_reply_init,
    (of_object_init_f)of_bsn_virtual_port_remove_request_init,
    (of_object_init_f)of_bsn_vlan_counter_clear_init,
    (of_object_init_f)of_bsn_vlan_counter_stats_reply_init,
    (of_object_init_f)of_bsn_vlan_counter_stats_request_init,
    (of_object_init_f)of_bsn_vrf_counter_stats_reply_init,
    (of_object_init_f)of_bsn_vrf_counter_stats_request_init,
    (of_object_init_f)of_bundle_add_msg_init,
    (of_object_init_f)of_bundle_ctrl_msg_init,
    (of_object_init_f)of_bundle_failed_error_msg_init,
    (of_object_init_f)of_desc_stats_reply_init,
    (of_object_init_f)of_desc_stats_request_init,
    (of_object_init_f)of_echo_reply_init,
    (of_object_init_f)of_echo_request_init,
    (of_object_init_f)of_error_msg_init,
    (of_object_init_f)of_experimenter_init,
    (of_object_init_f)of_experimenter_error_msg_init,
    (of_object_init_f)of_experimenter_stats_reply_init,
    (of_object_init_f)of_experimenter_stats_request_init,
    (of_object_init_f)of_features_reply_init,
    (of_object_init_f)of_features_request_init,
    (of_object_init_f)of_flow_add_init,
    (of_object_init_f)of_flow_delete_init,
    (of_object_init_f)of_flow_delete_strict_init,
    (of_object_init_f)of_flow_mod_init,
    (of_object_init_f)of_flow_mod_failed_error_msg_init,
    (of_object_init_f)of_flow_modify_init,
    (of_object_init_f)of_flow_modify_strict_init,
    (of_object_init_f)of_flow_monitor_failed_error_msg_init,
    (of_object_init_f)of_flow_removed_init,
    (of_object_init_f)of_flow_stats_reply_init,
    (of_object_init_f)of_flow_stats_request_init,
    (of_object_init_f)of_get_config_reply_init,
    (of_object_init_f)of_get_config_request_init,
    (of_object_init_f)of_group_add_init,
    (of_object_init_f)of_group_delete_init,
    (of_object_init_f)of_group_desc_stats_reply_init,
    (of_object_init_f)of_group_desc_stats_request_init,
    (of_object_init_f)of_group_features_stats_reply_init,
    (of_object_init_f)of_group_features_stats_request_init,
    (of_object_init_f)of_group_mod_init,
    (of_object_init_f)of_group_mod_failed_error_msg_init,
    (of_object_init_f)of_group_modify_init,
    (of_object_init_f)of_group_stats_reply_init,
    (of_object_init_f)of_group_stats_request_init,
    (of_object_init_f)of_header_init,
    (of_object_init_f)of_hello_init,
    (of_object_init_f)of_hello_failed_error_msg_init,
    (of_object_init_f)of_meter_config_stats_reply_init,
    (of_object_init_f)of_meter_config_stats_request_init,
    (of_object_init_f)of_meter_features_stats_reply_init,
    (of_object_init_f)of_meter_features_stats_request_init,
    (of_object_init_f)of_meter_mod_init,
    (of_object_init_f)of_meter_mod_failed_error_msg_init,
    (of_object_init_f)of_meter_stats_reply_init,
    (of_object_init_f)of_meter_stats_request_init,
    (of_object_init_f)of_nicira_controller_role_reply_init,
    (of_object_init_f)of_nicira_controller_role_request_init,
    (of_object_init_f)of_nicira_header_init,
    (of_object_init_f)of_packet_in_init,
    (of_object_init_f)of_packet_out_init,
    (of_object_init_f)of_port_desc_stats_reply_init,
    (of_object_init_f)of_port_desc_stats_request_init,
    (of_object_init_f)of_port_mod_init,
    (of_object_init_f)of_port_mod_failed_error_msg_init,
    (of_object_init_f)of_port_stats_reply_init,
    (of_object_init_f)of_port_stats_request_init,
    (of_object_init_f)of_port_status_init,
    (of_object_init_f)of_queue_desc_stats_reply_init,
    (of_object_init_f)of_queue_desc_stats_request_init,
    (of_object_init_f)of_queue_get_config_reply_init,
    (of_object_init_f)of_queue_get_config_request_init,
    (of_object_init_f)of_queue_op_failed_error_msg_init,
    (of_object_init_f)of_queue_stats_reply_init,
    (of_object_init_f)of_queue_stats_request_init,
    (of_object_init_f)of_requestforward_init,
    (of_object_init_f)of_role_reply_init,
    (of_object_init_f)of_role_request_init,
    (of_object_init_f)of_role_request_failed_error_msg_init,
    (of_object_init_f)of_role_status_init,
    (of_object_init_f)of_set_config_init,
    (of_object_init_f)of_stats_reply_init,
    (of_object_init_f)of_stats_request_init,
    (of_object_init_f)of_switch_config_failed_error_msg_init,
    (of_object_init_f)of_table_desc_stats_reply_init,
    (of_object_init_f)of_table_desc_stats_request_init,
    (of_object_init_f)of_table_features_failed_error_msg_init,
    (of_object_init_f)of_table_features_stats_reply_init,
    (of_object_init_f)of_table_features_stats_request_init,
    (of_object_init_f)of_table_mod_init,
    (of_object_init_f)of_table_mod_failed_error_msg_init,
    (of_object_init_f)of_table_stats_reply_init,
    (of_object_init_f)of_table_stats_request_init,
    (of_object_init_f)of_table_status_init,
    (of_object_init_f)of_action_init,
    (of_object_init_f)of_action_bsn_init,
    (of_object_init_f)of_action_bsn_checksum_init,
    (of_object_init_f)of_action_bsn_gentable_init,
    (of_object_init_f)of_action_bsn_mirror_init,
    (of_object_init_f)of_action_bsn_set_tunnel_dst_init,
    (of_object_init_f)of_action_copy_ttl_in_init,
    (of_object_init_f)of_action_copy_ttl_out_init,
    (of_object_init_f)of_action_dec_mpls_ttl_init,
    (of_object_init_f)of_action_dec_nw_ttl_init,
    (of_object_init_f)of_action_enqueue_init,
    (of_object_init_f)of_action_experimenter_init,
    (of_object_init_f)of_action_group_init,
    (of_object_init_f)of_action_id_init,
    (of_object_init_f)of_action_id_bsn_init,
    (of_object_init_f)of_action_id_bsn_checksum_init,
    (of_object_init_f)of_action_id_bsn_gentable_init,
    (of_object_init_f)of_action_id_bsn_mirror_init,
    (of_object_init_f)of_action_id_bsn_set_tunnel_dst_init,
    (of_object_init_f)of_action_id_copy_ttl_in_init,
    (of_object_init_f)of_action_id_copy_ttl_out_init,
    (of_object_init_f)of_action_id_dec_mpls_ttl_init,
    (of_object_init_f)of_action_id_dec_nw_ttl_init,
    (of_object_init_f)of_action_id_experimenter_init,
    (of_object_init_f)of_action_id_group_init,
    (of_object_init_f)of_action_id_nicira_init,
    (of_object_init_f)of_action_id_nicira_dec_ttl_init,
    (of_object_init_f)of_action_id_output_init,
    (of_object_init_f)of_action_id_pop_mpls_init,
    (of_object_init_f)of_action_id_pop_pbb_init,
    (of_object_init_f)of_action_id_pop_vlan_init,
    (of_object_init_f)of_action_id_push_mpls_init,
    (of_object_init_f)of_action_id_push_pbb_init,
    (of_object_init_f)of_action_id_push_vlan_init,
    (of_object_init_f)of_action_id_set_field_init,
    (of_object_init_f)of_action_id_set_mpls_ttl_init,
    (of_object_init_f)of_action_id_set_nw_ttl_init,
    (of_object_init_f)of_action_id_set_queue_init,
    (of_object_init_f)of_action_nicira_init,
    (of_object_init_f)of_action_nicira_dec_ttl_init,
    (of_object_init_f)of_action_output_init,
    (of_object_init_f)of_action_pop_mpls_init,
    (of_object_init_f)of_action_pop_pbb_init,
    (of_object_init_f)of_action_pop_vlan_init,
    (of_object_init_f)of_action_push_mpls_init,
    (of_object_init_f)of_action_push_pbb_init,
    (of_object_init_f)of_action_push_vlan_init,
    (of_object_init_f)of_action_set_dl_dst_init,
    (of_object_init_f)of_action_set_dl_src_init,
    (of_object_init_f)of_action_set_field_init,
    (of_object_init_f)of_action_set_mpls_label_init,
    (of_object_init_f)of_action_set_mpls_tc_init,
    (of_object_init_f)of_action_set_mpls_ttl_init,
    (of_object_init_f)of_action_set_nw_dst_init,
    (of_object_init_f)of_action_set_nw_ecn_init,
    (of_object_init_f)of_action_set_nw_src_init,
    (of_object_init_f)of_action_set_nw_tos_init,
    (of_object_init_f)of_action_set_nw_ttl_init,
    (of_object_init_f)of_action_set_queue_init,
    (of_object_init_f)of_action_set_tp_dst_init,
    (of_object_init_f)of_action_set_tp_src_init,
    (of_object_init_f)of_action_set_vlan_pcp_init,
    (of_object_init_f)of_action_set_vlan_vid_init,
    (of_object_init_f)of_action_strip_vlan_init,
    (of_object_init_f)of_async_config_prop_init,
    (of_object_init_f)of_async_config_prop_experimenter_master_init,
    (of_object_init_f)of_async_config_prop_experimenter_slave_init,
    (of_object_init_f)of_async_config_prop_flow_removed_master_init,
    (of_object_init_f)of_async_config_prop_flow_removed_slave_init,
    (of_object_init_f)of_async_config_prop_packet_in_master_init,
    (of_object_init_f)of_async_config_prop_packet_in_slave_init,
    (of_object_init_f)of_async_config_prop_port_status_master_init,
    (of_object_init_f)of_async_config_prop_port_status_slave_init,
    (of_object_init_f)of_async_config_prop_requestforward_master_init,
    (of_object_init_f)of_async_config_prop_requestforward_slave_init,
    (of_object_init_f)of_async_config_prop_role_status_master_init,
    (of_object_init_f)of_async_config_prop_role_status_slave_init,
    (of_object_init_f)of_async_config_prop_table_status_master_init,
    (of_object_init_f)of_async_config_prop_table_status_slave_init,
    (of_object_init_f)of_bsn_controller_connection_init,
    (of_object_init_f)of_bsn_debug_counter_desc_stats_entry_init,
    (of_object_init_f)of_bsn_debug_counter_stats_entry_init,
    (of_object_init_f)of_bsn_flow_checksum_bucket_stats_entry_init,
    (of_object_init_f)of_bsn_generic_stats_entry_init,
    (of_object_init_f)of_bsn_gentable_bucket_stats_entry_init,
    (of_object_init_f)of_bsn_gentable_desc_stats_entry_init,
    (of_object_init_f)of_bsn_gentable_entry_desc_stats_entry_init,
    (of_object_init_f)of_bsn_gentable_entry_stats_entry_init,
    (of_object_init_f)of_bsn_gentable_stats_entry_init,
    (of_object_init_f)of_bsn_interface_init,
    (of_object_init_f)of_bsn_lacp_stats_entry_init,
    (of_object_init_f)of_bsn_port_counter_stats_entry_init,
    (of_object_init_f)of_bsn_switch_pipeline_stats_entry_init,
    (of_object_init_f)of_bsn_table_checksum_stats_entry_init,
    (of_object_init_f)of_bsn_tlv_init,
    (of_object_init_f)of_bsn_tlv_actor_key_init,
    (of_object_init_f)of_bsn_tlv_actor_port_num_init,
    (of_object_init_f)of_bsn_tlv_actor_port_priority_init,
    (of_object_init_f)of_bsn_tlv_actor_state_init,
    (of_object_init_f)of_bsn_tlv_actor_system_mac_init,
    (of_object_init_f)of_bsn_tlv_actor_system_priority_init,
    (of_object_init_f)of_bsn_tlv_anchor_init,
    (of_object_init_f)of_bsn_tlv_broadcast_query_timeout_init,
    (of_object_init_f)of_bsn_tlv_broadcast_rate_init,
    (of_object_init_f)of_bsn_tlv_bucket_init,
    (of_object_init_f)of_bsn_tlv_circuit_id_init,
    (of_object_init_f)of_bsn_tlv_convergence_status_init,
    (of_object_init_f)of_bsn_tlv_cpu_lag_init,
    (of_object_init_f)of_bsn_tlv_crc_enabled_init,
    (of_object_init_f)of_bsn_tlv_data_init,
    (of_object_init_f)of_bsn_tlv_decap_init,
    (of_object_init_f)of_bsn_tlv_dscp_init,
    (of_object_init_f)of_bsn_tlv_eth_dst_init,
    (of_object_init_f)of_bsn_tlv_eth_src_init,
    (of_object_init_f)of_bsn_tlv_external_gateway_ip_init,
    (of_object_init_f)of_bsn_tlv_external_gateway_mac_init,
    (of_object_init_f)of_bsn_tlv_external_ip_init,
    (of_object_init_f)of_bsn_tlv_external_mac_init,
    (of_object_init_f)of_bsn_tlv_external_netmask_init,
    (of_object_init_f)of_bsn_tlv_generation_id_init,
    (of_object_init_f)of_bsn_tlv_hash_gtp_header_match_init,
    (of_object_init_f)of_bsn_tlv_hash_gtp_port_match_init,
    (of_object_init_f)of_bsn_tlv_hash_packet_field_init,
    (of_object_init_f)of_bsn_tlv_hash_packet_type_init,
    (of_object_init_f)of_bsn_tlv_hash_seed_init,
    (of_object_init_f)of_bsn_tlv_hash_type_init,
    (of_object_init_f)of_bsn_tlv_header_size_init,
    (of_object_init_f)of_bsn_tlv_icmp_code_init,
    (of_object_init_f)of_bsn_tlv_icmp_id_init,
    (of_object_init_f)of_bsn_tlv_icmp_type_init,
    (of_object_init_f)of_bsn_tlv_idle_notification_init,
    (of_object_init_f)of_bsn_tlv_idle_time_init,
    (of_object_init_f)of_bsn_tlv_idle_timeout_init,
    (of_object_init_f)of_bsn_tlv_igmp_snooping_init,
    (of_object_init_f)of_bsn_tlv_internal_gateway_mac_init,
    (of_object_init_f)of_bsn_tlv_internal_mac_init,
    (of_object_init_f)of_bsn_tlv_interval_init,
    (of_object_init_f)of_bsn_tlv_ip_proto_init,
    (of_object_init_f)of_bsn_tlv_ipv4_init,
    (of_object_init_f)of_bsn_tlv_ipv4_dst_init,
    (of_object_init_f)of_bsn_tlv_ipv4_netmask_init,
    (of_object_init_f)of_bsn_tlv_ipv4_src_init,
    (of_object_init_f)of_bsn_tlv_ipv6_init,
    (of_object_init_f)of_bsn_tlv_known_multicast_rate_init,
    (of_object_init_f)of_bsn_tlv_l2_multicast_lookup_init,
    (of_object_init_f)of_bsn_tlv_loopback_port_init,
    (of_object_init_f)of_bsn_tlv_mac_init,
    (of_object_init_f)of_bsn_tlv_mac_mask_init,
    (of_object_init_f)of_bsn_tlv_mcg_type_vxlan_init,
    (of_object_init_f)of_bsn_tlv_miss_packets_init,
    (of_object_init_f)of_bsn_tlv_mpls_control_word_init,
    (of_object_init_f)of_bsn_tlv_mpls_label_init,
    (of_object_init_f)of_bsn_tlv_mpls_sequenced_init,
    (of_object_init_f)of_bsn_tlv_multicast_interface_id_init,
    (of_object_init_f)of_bsn_tlv_name_init,
    (of_object_init_f)of_bsn_tlv_negate_init,
    (of_object_init_f)of_bsn_tlv_next_hop_ipv4_init,
    (of_object_init_f)of_bsn_tlv_next_hop_mac_init,
    (of_object_init_f)of_bsn_tlv_nexthop_type_vxlan_init,
    (of_object_init_f)of_bsn_tlv_offset_init,
    (of_object_init_f)of_bsn_tlv_parent_port_init,
    (of_object_init_f)of_bsn_tlv_partner_key_init,
    (of_object_init_f)of_bsn_tlv_partner_port_num_init,
    (of_object_init_f)of_bsn_tlv_partner_port_priority_init,
    (of_object_init_f)of_bsn_tlv_partner_state_init,
    (of_object_init_f)of_bsn_tlv_partner_system_mac_init,
    (of_object_init_f)of_bsn_tlv_partner_system_priority_init,
    (of_object_init_f)of_bsn_tlv_port_init,
    (of_object_init_f)of_bsn_tlv_port_vxlan_mode_init,
    (of_object_init_f)of_bsn_tlv_priority_init,
    (of_object_init_f)of_bsn_tlv_qos_priority_init,
    (of_object_init_f)of_bsn_tlv_queue_id_init,
    (of_object_init_f)of_bsn_tlv_queue_weight_init,
    (of_object_init_f)of_bsn_tlv_rate_limit_init,
    (of_object_init_f)of_bsn_tlv_rate_unit_init,
    (of_object_init_f)of_bsn_tlv_reference_init,
    (of_object_init_f)of_bsn_tlv_reply_packets_init,
    (of_object_init_f)of_bsn_tlv_request_packets_init,
    (of_object_init_f)of_bsn_tlv_rx_bytes_init,
    (of_object_init_f)of_bsn_tlv_rx_packets_init,
    (of_object_init_f)of_bsn_tlv_sampling_rate_init,
    (of_object_init_f)of_bsn_tlv_set_loopback_mode_init,
    (of_object_init_f)of_bsn_tlv_status_init,
    (of_object_init_f)of_bsn_tlv_strip_mpls_l2_on_ingress_init,
    (of_object_init_f)of_bsn_tlv_strip_mpls_l3_on_ingress_init,
    (of_object_init_f)of_bsn_tlv_strip_vlan_on_egress_init,
    (of_object_init_f)of_bsn_tlv_sub_agent_id_init,
    (of_object_init_f)of_bsn_tlv_tcp_dst_init,
    (of_object_init_f)of_bsn_tlv_tcp_src_init,
    (of_object_init_f)of_bsn_tlv_ttl_init,
    (of_object_init_f)of_bsn_tlv_tx_bytes_init,
    (of_object_init_f)of_bsn_tlv_tx_packets_init,
    (of_object_init_f)of_bsn_tlv_udf_anchor_init,
    (of_object_init_f)of_bsn_tlv_udf_id_init,
    (of_object_init_f)of_bsn_tlv_udf_length_init,
    (of_object_init_f)of_bsn_tlv_udf_offset_init,
    (of_object_init_f)of_bsn_tlv_udp_dst_init,
    (of_object_init_f)of_bsn_tlv_udp_src_init,
    (of_object_init_f)of_bsn_tlv_unicast_query_timeout_init,
    (of_object_init_f)of_bsn_tlv_unicast_rate_init,
    (of_object_init_f)of_bsn_tlv_unknown_multicast_rate_init,
    (of_object_init_f)of_bsn_tlv_untagged_init,
    (of_object_init_f)of_bsn_tlv_use_packet_state_init,
    (of_object_init_f)of_bsn_tlv_vfi_init,
    (of_object_init_f)of_bsn_tlv_vfp_class_id_init,
    (of_object_init_f)of_bsn_tlv_vlan_mac_list_init,
    (of_object_init_f)of_bsn_tlv_vlan_pcp_init,
    (of_object_init_f)of_bsn_tlv_vlan_vid_init,
    (of_object_init_f)of_bsn_tlv_vlan_vid_mask_init,
    (of_object_init_f)of_bsn_tlv_vni_init,
    (of_object_init_f)of_bsn_tlv_vpn_key_init,
    (of_object_init_f)of_bsn_tlv_vrf_init,
    (of_object_init_f)of_bsn_tlv_vxlan_egress_lag_init,
    (of_object_init_f)of_bsn_vlan_counter_stats_entry_init,
    (of_object_init_f)of_bsn_vlan_mac_init,
    (of_object_init_f)of_bsn_vport_init,
    (of_object_init_f)of_bsn_vport_l2gre_init,
    (of_object_init_f)of_bsn_vport_q_in_q_init,
    (of_object_init_f)of_bsn_vrf_counter_stats_entry_init,
    (of_object_init_f)of_bucket_init,
    (of_object_init_f)of_bucket_counter_init,
    (of_object_init_f)of_bundle_prop_init,
    (of_object_init_f)of_bundle_prop_experimenter_init,
    (of_object_init_f)of_flow_stats_entry_init,
    (of_object_init_f)of_group_desc_stats_entry_init,
    (of_object_init_f)of_group_stats_entry_init,
    (of_object_init_f)of_hello_elem_init,
    (of_object_init_f)of_hello_elem_versionbitmap_init,
    (of_object_init_f)of_instruction_init,
    (of_object_init_f)of_instruction_apply_actions_init,
    (of_object_init_f)of_instruction_bsn_init,
    (of_object_init_f)of_instruction_bsn_arp_offload_init,
    (of_object_init_f)of_instruction_bsn_auto_negotiation_init,
    (of_object_init_f)of_instruction_bsn_deny_init,
    (of_object_init_f)of_instruction_bsn_dhcp_offload_init,
    (of_object_init_f)of_instruction_bsn_disable_l3_init,
    (of_object_init_f)of_instruction_bsn_disable_split_horizon_check_init,
    (of_object_init_f)of_instruction_bsn_disable_src_mac_check_init,
    (of_object_init_f)of_instruction_bsn_disable_vlan_counters_init,
    (of_object_init_f)of_instruction_bsn_internal_priority_init,
    (of_object_init_f)of_instruction_bsn_packet_of_death_init,
    (of_object_init_f)of_instruction_bsn_permit_init,
    (of_object_init_f)of_instruction_bsn_prioritize_pdus_init,
    (of_object_init_f)of_instruction_bsn_require_vlan_xlate_init,
    (of_object_init_f)of_instruction_bsn_span_destination_init,
    (of_object_init_f)of_instruction_clear_actions_init,
    (of_object_init_f)of_instruction_experimenter_init,
    (of_object_init_f)of_instruction_goto_table_init,
    (of_object_init_f)of_instruction_id_init,
    (of_object_init_f)of_instruction_id_apply_actions_init,
    (of_object_init_f)of_instruction_id_bsn_init,
    (of_object_init_f)of_instruction_id_bsn_arp_offload_init,
    (of_object_init_f)of_instruction_id_bsn_auto_negotiation_init,
    (of_object_init_f)of_instruction_id_bsn_deny_init,
    (of_object_init_f)of_instruction_id_bsn_dhcp_offload_init,
    (of_object_init_f)of_instruction_id_bsn_disable_l3_init,
    (of_object_init_f)of_instruction_id_bsn_disable_split_horizon_check_init,
    (of_object_init_f)of_instruction_id_bsn_disable_src_mac_check_init,
    (of_object_init_f)of_instruction_id_bsn_disable_vlan_counters_init,
    (of_object_init_f)of_instruction_id_bsn_internal_priority_init,
    (of_object_init_f)of_instruction_id_bsn_packet_of_death_init,
    (of_object_init_f)of_instruction_id_bsn_permit_init,
    (of_object_init_f)of_instruction_id_bsn_prioritize_pdus_init,
    (of_object_init_f)of_instruction_id_bsn_require_vlan_xlate_init,
    (of_object_init_f)of_instruction_id_bsn_span_destination_init,
    (of_object_init_f)of_instruction_id_clear_actions_init,
    (of_object_init_f)of_instruction_id_experimenter_init,
    (of_object_init_f)of_instruction_id_goto_table_init,
    (of_object_init_f)of_instruction_id_meter_init,
    (of_object_init_f)of_instruction_id_write_actions_init,
    (of_object_init_f)of_instruction_id_write_metadata_init,
    (of_object_init_f)of_instruction_meter_init,
    (of_object_init_f)of_instruction_write_actions_init,
    (of_object_init_f)of_instruction_write_metadata_init,
    (of_object_init_f)of_match_v1_init,
    (of_object_init_f)of_match_v2_init,
    (of_object_init_f)of_match_v3_init,
    (of_object_init_f)of_meter_band_init,
    (of_object_init_f)of_meter_band_drop_init,
    (of_object_init_f)of_meter_band_dscp_remark_init,
    (of_object_init_f)of_meter_band_experimenter_init,
    (of_object_init_f)of_meter_band_stats_init,
    (of_object_init_f)of_meter_config_init,
    (of_object_init_f)of_meter_features_init,
    (of_object_init_f)of_meter_stats_init,
    (of_object_init_f)of_oxm_init,
    (of_object_init_f)of_oxm_arp_op_init,
    (of_object_init_f)of_oxm_arp_op_masked_init,
    (of_object_init_f)of_oxm_arp_sha_init,
    (of_object_init_f)of_oxm_arp_sha_masked_init,
    (of_object_init_f)of_oxm_arp_spa_init,
    (of_object_init_f)of_oxm_arp_spa_masked_init,
    (of_object_init_f)of_oxm_arp_tha_init,
    (of_object_init_f)of_oxm_arp_tha_masked_init,
    (of_object_init_f)of_oxm_arp_tpa_init,
    (of_object_init_f)of_oxm_arp_tpa_masked_init,
    (of_object_init_f)of_oxm_bsn_egr_port_group_id_init,
    (of_object_init_f)of_oxm_bsn_egr_port_group_id_masked_init,
    (of_object_init_f)of_oxm_bsn_global_vrf_allowed_init,
    (of_object_init_f)of_oxm_bsn_global_vrf_allowed_masked_init,
    (of_object_init_f)of_oxm_bsn_in_ports_128_init,
    (of_object_init_f)of_oxm_bsn_in_ports_128_masked_init,
    (of_object_init_f)of_oxm_bsn_in_ports_512_init,
    (of_object_init_f)of_oxm_bsn_in_ports_512_masked_init,
    (of_object_init_f)of_oxm_bsn_ingress_port_group_id_init,
    (of_object_init_f)of_oxm_bsn_ingress_port_group_id_masked_init,
    (of_object_init_f)of_oxm_bsn_inner_eth_dst_init,
    (of_object_init_f)of_oxm_bsn_inner_eth_dst_masked_init,
    (of_object_init_f)of_oxm_bsn_inner_eth_src_init,
    (of_object_init_f)of_oxm_bsn_inner_eth_src_masked_init,
    (of_object_init_f)of_oxm_bsn_inner_vlan_vid_init,
    (of_object_init_f)of_oxm_bsn_inner_vlan_vid_masked_init,
    (of_object_init_f)of_oxm_bsn_l2_cache_hit_init,
    (of_object_init_f)of_oxm_bsn_l2_cache_hit_masked_init,
    (of_object_init_f)of_oxm_bsn_l3_dst_class_id_init,
    (of_object_init_f)of_oxm_bsn_l3_dst_class_id_masked_init,
    (of_object_init_f)of_oxm_bsn_l3_interface_class_id_init,
    (of_object_init_f)of_oxm_bsn_l3_interface_class_id_masked_init,
    (of_object_init_f)of_oxm_bsn_l3_src_class_id_init,
    (of_object_init_f)of_oxm_bsn_l3_src_class_id_masked_init,
    (of_object_init_f)of_oxm_bsn_lag_id_init,
    (of_object_init_f)of_oxm_bsn_lag_id_masked_init,
    (of_object_init_f)of_oxm_bsn_tcp_flags_init,
    (of_object_init_f)of_oxm_bsn_tcp_flags_masked_init,
    (of_object_init_f)of_oxm_bsn_udf0_init,
    (of_object_init_f)of_oxm_bsn_udf0_masked_init,
    (of_object_init_f)of_oxm_bsn_udf1_init,
    (of_object_init_f)of_oxm_bsn_udf1_masked_init,
    (of_object_init_f)of_oxm_bsn_udf2_init,
    (of_object_init_f)of_oxm_bsn_udf2_masked_init,
    (of_object_init_f)of_oxm_bsn_udf3_init,
    (of_object_init_f)of_oxm_bsn_udf3_masked_init,
    (of_object_init_f)of_oxm_bsn_udf4_init,
    (of_object_init_f)of_oxm_bsn_udf4_masked_init,
    (of_object_init_f)of_oxm_bsn_udf5_init,
    (of_object_init_f)of_oxm_bsn_udf5_masked_init,
    (of_object_init_f)of_oxm_bsn_udf6_init,
    (of_object_init_f)of_oxm_bsn_udf6_masked_init,
    (of_object_init_f)of_oxm_bsn_udf7_init,
    (of_object_init_f)of_oxm_bsn_udf7_masked_init,
    (of_object_init_f)of_oxm_bsn_vfi_init,
    (of_object_init_f)of_oxm_bsn_vfi_masked_init,
    (of_object_init_f)of_oxm_bsn_vlan_xlate_port_group_id_init,
    (of_object_init_f)of_oxm_bsn_vlan_xlate_port_group_id_masked_init,
    (of_object_init_f)of_oxm_bsn_vrf_init,
    (of_object_init_f)of_oxm_bsn_vrf_masked_init,
    (of_object_init_f)of_oxm_bsn_vxlan_network_id_init,
    (of_object_init_f)of_oxm_bsn_vxlan_network_id_masked_init,
    (of_object_init_f)of_oxm_eth_dst_init,
    (of_object_init_f)of_oxm_eth_dst_masked_init,
    (of_object_init_f)of_oxm_eth_src_init,
    (of_object_init_f)of_oxm_eth_src_masked_init,
    (of_object_init_f)of_oxm_eth_type_init,
    (of_object_init_f)of_oxm_eth_type_masked_init,
    (of_object_init_f)of_oxm_icmpv4_code_init,
    (of_object_init_f)of_oxm_icmpv4_code_masked_init,
    (of_object_init_f)of_oxm_icmpv4_type_init,
    (of_object_init_f)of_oxm_icmpv4_type_masked_init,
    (of_object_init_f)of_oxm_icmpv6_code_init,
    (of_object_init_f)of_oxm_icmpv6_code_masked_init,
    (of_object_init_f)of_oxm_icmpv6_type_init,
    (of_object_init_f)of_oxm_icmpv6_type_masked_init,
    (of_object_init_f)of_oxm_in_phy_port_init,
    (of_object_init_f)of_oxm_in_phy_port_masked_init,
    (of_object_init_f)of_oxm_in_port_init,
    (of_object_init_f)of_oxm_in_port_masked_init,
    (of_object_init_f)of_oxm_ip_dscp_init,
    (of_object_init_f)of_oxm_ip_dscp_masked_init,
    (of_object_init_f)of_oxm_ip_ecn_init,
    (of_object_init_f)of_oxm_ip_ecn_masked_init,
    (of_object_init_f)of_oxm_ip_proto_init,
    (of_object_init_f)of_oxm_ip_proto_masked_init,
    (of_object_init_f)of_oxm_ipv4_dst_init,
    (of_object_init_f)of_oxm_ipv4_dst_masked_init,
    (of_object_init_f)of_oxm_ipv4_src_init,
    (of_object_init_f)of_oxm_ipv4_src_masked_init,
    (of_object_init_f)of_oxm_ipv6_dst_init,
    (of_object_init_f)of_oxm_ipv6_dst_masked_init,
    (of_object_init_f)of_oxm_ipv6_exthdr_init,
    (of_object_init_f)of_oxm_ipv6_exthdr_masked_init,
    (of_object_init_f)of_oxm_ipv6_flabel_init,
    (of_object_init_f)of_oxm_ipv6_flabel_masked_init,
    (of_object_init_f)of_oxm_ipv6_nd_sll_init,
    (of_object_init_f)of_oxm_ipv6_nd_sll_masked_init,
    (of_object_init_f)of_oxm_ipv6_nd_target_init,
    (of_object_init_f)of_oxm_ipv6_nd_target_masked_init,
    (of_object_init_f)of_oxm_ipv6_nd_tll_init,
    (of_object_init_f)of_oxm_ipv6_nd_tll_masked_init,
    (of_object_init_f)of_oxm_ipv6_src_init,
    (of_object_init_f)of_oxm_ipv6_src_masked_init,
    (of_object_init_f)of_oxm_metadata_init,
    (of_object_init_f)of_oxm_metadata_masked_init,
    (of_object_init_f)of_oxm_mpls_bos_init,
    (of_object_init_f)of_oxm_mpls_bos_masked_init,
    (of_object_init_f)of_oxm_mpls_label_init,
    (of_object_init_f)of_oxm_mpls_label_masked_init,
    (of_object_init_f)of_oxm_mpls_tc_init,
    (of_object_init_f)of_oxm_mpls_tc_masked_init,
    (of_object_init_f)of_oxm_pbb_uca_init,
    (of_object_init_f)of_oxm_pbb_uca_masked_init,
    (of_object_init_f)of_oxm_sctp_dst_init,
    (of_object_init_f)of_oxm_sctp_dst_masked_init,
    (of_object_init_f)of_oxm_sctp_src_init,
    (of_object_init_f)of_oxm_sctp_src_masked_init,
    (of_object_init_f)of_oxm_tcp_dst_init,
    (of_object_init_f)of_oxm_tcp_dst_masked_init,
    (of_object_init_f)of_oxm_tcp_src_init,
    (of_object_init_f)of_oxm_tcp_src_masked_init,
    (of_object_init_f)of_oxm_tunnel_id_init,
    (of_object_init_f)of_oxm_tunnel_id_masked_init,
    (of_object_init_f)of_oxm_tunnel_ipv4_dst_init,
    (of_object_init_f)of_oxm_tunnel_ipv4_dst_masked_init,
    (of_object_init_f)of_oxm_tunnel_ipv4_src_init,
    (of_object_init_f)of_oxm_tunnel_ipv4_src_masked_init,
    (of_object_init_f)of_oxm_udp_dst_init,
    (of_object_init_f)of_oxm_udp_dst_masked_init,
    (of_object_init_f)of_oxm_udp_src_init,
    (of_object_init_f)of_oxm_udp_src_masked_init,
    (of_object_init_f)of_oxm_vlan_pcp_init,
    (of_object_init_f)of_oxm_vlan_pcp_masked_init,
    (of_object_init_f)of_oxm_vlan_vid_init,
    (of_object_init_f)of_oxm_vlan_vid_masked_init,
    (of_object_init_f)of_packet_queue_init,
    (of_object_init_f)of_port_desc_init,
    (of_object_init_f)of_port_desc_prop_init,
    (of_object_init_f)of_port_desc_prop_bsn_init,
    (of_object_init_f)of_port_desc_prop_bsn_generation_id_init,
    (of_object_init_f)of_port_desc_prop_bsn_uplink_init,
    (of_object_init_f)of_port_desc_prop_ethernet_init,
    (of_object_init_f)of_port_desc_prop_experimenter_init,
    (of_object_init_f)of_port_desc_prop_optical_init,
    (of_object_init_f)of_port_mod_prop_init,
    (of_object_init_f)of_port_mod_prop_ethernet_init,
    (of_object_init_f)of_port_mod_prop_experimenter_init,
    (of_object_init_f)of_port_mod_prop_optical_init,
    (of_object_init_f)of_port_stats_entry_init,
    (of_object_init_f)of_port_stats_prop_init,
    (of_object_init_f)of_port_stats_prop_ethernet_init,
    (of_object_init_f)of_port_stats_prop_experimenter_init,
    (of_object_init_f)of_port_stats_prop_optical_init,
    (of_object_init_f)of_queue_desc_init,
    (of_object_init_f)of_queue_desc_prop_init,
    (of_object_init_f)of_queue_desc_prop_experimenter_init,
    (of_object_init_f)of_queue_desc_prop_max_rate_init,
    (of_object_init_f)of_queue_desc_prop_min_rate_init,
    (of_object_init_f)of_queue_prop_init,
    (of_object_init_f)of_queue_prop_experimenter_init,
    (of_object_init_f)of_queue_prop_max_rate_init,
    (of_object_init_f)of_queue_prop_min_rate_init,
    (of_object_init_f)of_queue_stats_entry_init,
    (of_object_init_f)of_queue_stats_prop_init,
    (of_object_init_f)of_queue_stats_prop_experimenter_init,
    (of_object_init_f)of_role_prop_init,
    (of_object_init_f)of_role_prop_experimenter_init,
    (of_object_init_f)of_table_desc_init,
    (of_object_init_f)of_table_feature_prop_init,
    (of_object_init_f)of_table_feature_prop_apply_actions_init,
    (of_object_init_f)of_table_feature_prop_apply_actions_miss_init,
    (of_object_init_f)of_table_feature_prop_apply_setfield_init,
    (of_object_init_f)of_table_feature_prop_apply_setfield_miss_init,
    (of_object_init_f)of_table_feature_prop_experimenter_init,
    (of_object_init_f)of_table_feature_prop_experimenter_miss_init,
    (of_object_init_f)of_table_feature_prop_instructions_init,
    (of_object_init_f)of_table_feature_prop_instructions_miss_init,
    (of_object_init_f)of_table_feature_prop_match_init,
    (of_object_init_f)of_table_feature_prop_next_tables_init,
    (of_object_init_f)of_table_feature_prop_next_tables_miss_init,
    (of_object_init_f)of_table_feature_prop_table_sync_from_init,
    (of_object_init_f)of_table_feature_prop_wildcards_init,
    (of_object_init_f)of_table_feature_prop_write_actions_init,
    (of_object_init_f)of_table_feature_prop_write_actions_miss_init,
    (of_object_init_f)of_table_feature_prop_write_setfield_init,
    (of_object_init_f)of_table_feature_prop_write_setfield_miss_init,
    (of_object_init_f)of_table_features_init,
    (of_object_init_f)of_table_mod_prop_init,
    (of_object_init_f)of_table_mod_prop_eviction_init,
    (of_object_init_f)of_table_mod_prop_experimenter_init,
    (of_object_init_f)of_table_mod_prop_vacancy_init,
    (of_object_init_f)of_table_stats_entry_init,
    (of_object_init_f)of_uint32_init,
    (of_object_init_f)of_uint64_init,
    (of_object_init_f)of_uint8_init,
    (of_object_init_f)of_list_action_init,
    (of_object_init_f)of_list_action_id_init,
    (of_object_init_f)of_list_async_config_prop_init,
    (of_object_init_f)of_list_bsn_controller_connection_init,
    (of_object_init_f)of_list_bsn_debug_counter_desc_stats_entry_init,
    (of_object_init_f)of_list_bsn_debug_counter_stats_entry_init,
    (of_object_init_f)of_list_bsn_flow_checksum_bucket_stats_entry_init,
    (of_object_init_f)of_list_bsn_generic_stats_entry_init,
    (of_object_init_f)of_list_bsn_gentable_bucket_stats_entry_init,
    (of_object_init_f)of_list_bsn_gentable_desc_stats_entry_init,
    (of_object_init_f)of_list_bsn_gentable_entry_desc_stats_entry_init,
    (of_object_init_f)of_list_bsn_gentable_entry_stats_entry_init,
    (of_object_init_f)of_list_bsn_gentable_stats_entry_init,
    (of_object_init_f)of_list_bsn_interface_init,
    (of_object_init_f)of_list_bsn_lacp_stats_entry_init,
    (of_object_init_f)of_list_bsn_port_counter_stats_entry_init,
    (of_object_init_f)of_list_bsn_switch_pipeline_stats_entry_init,
    (of_object_init_f)of_list_bsn_table_checksum_stats_entry_init,
    (of_object_init_f)of_list_bsn_tlv_init,
    (of_object_init_f)of_list_bsn_vlan_counter_stats_entry_init,
    (of_object_init_f)of_list_bsn_vlan_mac_init,
    (of_object_init_f)of_list_bsn_vrf_counter_stats_entry_init,
    (of_object_init_f)of_list_bucket_init,
    (of_object_init_f)of_list_bucket_counter_init,
    (of_object_init_f)of_list_bundle_prop_init,
    (of_object_init_f)of_list_flow_stats_entry_init,
    (of_object_init_f)of_list_group_desc_stats_entry_init,
    (of_object_init_f)of_list_group_stats_entry_init,
    (of_object_init_f)of_list_hello_elem_init,
    (of_object_init_f)of_list_instruction_init,
    (of_object_init_f)of_list_instruction_id_init,
    (of_object_init_f)of_list_meter_band_init,
    (of_object_init_f)of_list_meter_band_stats_init,
    (of_object_init_f)of_list_meter_config_init,
    (of_object_init_f)of_list_meter_stats_init,
    (of_object_init_f)of_list_oxm_init,
    (of_object_init_f)of_list_packet_queue_init,
    (of_object_init_f)of_list_port_desc_init,
    (of_object_init_f)of_list_port_desc_prop_init,
    (of_object_init_f)of_list_port_mod_prop_init,
    (of_object_init_f)of_list_port_stats_entry_init,
    (of_object_init_f)of_list_port_stats_prop_init,
    (of_object_init_f)of_list_queue_desc_init,
    (of_object_init_f)of_list_queue_desc_prop_init,
    (of_object_init_f)of_list_queue_prop_init,
    (of_object_init_f)of_list_queue_stats_entry_init,
    (of_object_init_f)of_list_queue_stats_prop_init,
    (of_object_init_f)of_list_role_prop_init,
    (of_object_init_f)of_list_table_desc_init,
    (of_object_init_f)of_list_table_feature_prop_init,
    (of_object_init_f)of_list_table_features_init,
    (of_object_init_f)of_list_table_mod_prop_init,
    (of_object_init_f)of_list_table_stats_entry_init,
    (of_object_init_f)of_list_uint32_init,
    (of_object_init_f)of_list_uint64_init,
    (of_object_init_f)of_list_uint8_init,
};
